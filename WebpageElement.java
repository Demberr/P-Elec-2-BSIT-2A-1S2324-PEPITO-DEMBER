class WebpageElement {
    private String id;
    private String content;

    public WebpageElement(String id, String content) {
        this.id = id;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}