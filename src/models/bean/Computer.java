package models.bean;

import java.io.Serializable;

public class Computer implements Serializable{
    private int  id;
    private String name;
    private String kind;
    private String color;
    private String price;
    private String cpu;
    private String ram;
    private String graphicCard;
    private String memory;
    private String pin;
    private String screen;
    private String image;

    public Computer(){}

    public Computer(int id, String name,String kind, String color, String price, String cpu, String ram, String graphicCard, String memory, String pin, String screen, String image) {
        this.id = id;
        this.name = name;
        this.kind = kind;
        this.color = color;
        this.price = price;
        this.cpu = cpu;
        this.ram = ram;
        this.graphicCard = graphicCard;
        this.memory = memory;
        this.pin = pin;
        this.screen = screen;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
