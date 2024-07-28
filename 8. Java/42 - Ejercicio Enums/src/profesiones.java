public enum profesiones {
    BACK_END_DEVELOPER("Back end Developer"),
    FRONT_END_DEVELOPER("Front end Developer"),
    FULL_STACK_DEVELOPER("Full Stack Developer");

    private String description;

    profesiones(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
