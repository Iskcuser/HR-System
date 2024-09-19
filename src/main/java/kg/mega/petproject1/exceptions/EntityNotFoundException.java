package kg.mega.petproject1.exceptions;

public class EntityNotFoundException extends Exception{
    public EntityNotFoundException(){
        super("Entity not found");
    }
}
