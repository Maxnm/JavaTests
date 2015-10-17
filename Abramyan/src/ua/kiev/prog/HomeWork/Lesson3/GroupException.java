package ua.kiev.prog.HomeWork.Lesson3;

public class GroupException extends Exception {
    @Override
    public String getMessage() {
        return "Group is full";
    }
}
