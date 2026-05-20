package kg.mega.hrproject.controller;

import kg.mega.hrproject.entity.User;
import kg.mega.hrproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @GetMapping
    public List<User> getAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable Integer id) {
        return userService.getById(id);
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user) {
        userService.create(user);
        return ResponseEntity.ok(user);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody User user) {
        userService.update(user);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) {
        userService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/role/{roleId}")
    public List<User> getUserByRoleId(@PathVariable("roleId") Integer roleId) {
        return userService.findUserByRoleId(roleId);

    }

    @GetMapping("/positionId/{positionId}")
    public List<User> getUserByPositionId(@PathVariable("positionId") Long positionId) {
        return userService.findUserByPositionId(positionId);
    }
}
