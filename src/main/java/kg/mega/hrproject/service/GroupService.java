package kg.mega.hrproject.service;

import kg.mega.hrproject.entity.Group;
import kg.mega.hrproject.repository.GroupRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class GroupService {
    private final GroupRepository groupRepository;

    public Group create(Group group) {
        return groupRepository.save(group);
    }

    public void deleteById(Long id) {
        groupRepository.deleteById(id);

    }

    public List<Group> findAll() {
        return groupRepository.findAll();
    }

    public Group findById(Long id) {
        return groupRepository.findById(id).orElse(null);
    }

    public Group update(Group group) {
        return groupRepository.save(group);
    }
}

