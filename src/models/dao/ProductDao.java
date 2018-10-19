package models.dao;
import models.bean.Computer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    public static List<Computer> listComputers(String type,
                                               String color,String price, String cpu,String ram,  String graphic, String storage, String battery, String display ) {

        List<Computer> listComputer = new ArrayList<>();
        Connection getConnection = DBUtil.ConnectionString();

        String qType="image is not NULL";
        String qColor = "image is not NULL";
        String qPrice = "image is not NULL";
        String qCPU = "image is not NULL";
        String qRam = "image is not NULL";
        String qGraphic = "image is not NULL";
        String qStorage = "image is not NULL";
        String qBattery = "image is not NULL";
        String qDisplay = "image is not NULL";
        if (type != null)
            qType = " kind =  " +  "'" +type +"'";

        System.out.println("dao : " +  qType);
        if(color != null) {

            qColor = " color = " + "'" + color + "'";
            System.out.println(qColor);
        }
        if(price != null) {

            if(price.equals("5-10")) {
                qPrice = "(price >= 5000000 AND price <= 10000000)";
            } else  if (price.equals("10-15")) {
                qPrice = "(price >= 10000000 AND price <= 15000000)";
            }
            else if (price.equals("15-20")) {
                qPrice = "(price >= 15000000 AND price <= 20000000)";
            } else {
                qPrice = "price > 20000000";
            }
        }
        if(cpu != null)
            qCPU = " cpu = "+"'" +cpu +  "'" ;
        if(ram != null)
            qRam = "ram="+  "'" +  ram +  "'";
        if(graphic != null)
            qGraphic = "graphic_card=" + "'" + graphic +  "'";
        if(storage != null)
            qStorage  = "kind_of_memory="+ "'" +  storage  +  "'";
        if(battery != null)
            qBattery = "pin="+  "'" +  battery  +  "'" ;
        if(display != null)
            qDisplay = "screen="+  "'" + display +  "'" ;
        String dummy=" and ";

        String query = "SELECT * FROM Computer where " +qType+ dummy+ qColor + dummy
                + qPrice + dummy + qCPU + dummy + qRam + dummy + qGraphic + dummy +qStorage
                +dummy + qBattery + dummy + qDisplay;

        try {
            Statement statement = getConnection.createStatement();
            ResultSet result = statement.executeQuery(query);
            while(result.next()){
                int id_c = result.getInt(1);
                String name_c = result.getString(2);
                String kind_c = result.getString(3);
                String color_c = result.getString(4);
                String price_c = result.getString(5);
                String cpu_c = result.getString(6);
                String ram_c = result.getString(7);
                String graphicCard_c = result.getString(8);
                String memory_c = result.getString(9);
                String pin_c = result.getString(10);
                String screen_c = result.getString(11);
                String image_c = result.getString(12);

                Computer computer = new Computer();
                computer.setId(id_c);
                computer.setName(name_c);
                computer.setKind(kind_c);
                computer.setColor(color_c);
                computer.setPrice(price_c);
                computer.setCpu(cpu_c);
                computer.setRam(ram_c);
                computer.setGraphicCard(graphicCard_c);
                computer.setMemory(memory_c);
                computer.setPin(pin_c);
                computer.setScreen(screen_c);
                computer.setImage(image_c);

                listComputer.add(computer);
            }
        } catch (SQLException e) {
            System.out.println("loi " + e.getMessage());
        }
        for (Computer computer: listComputer) {
            System.out.println(computer.getName());
        }
        return listComputer;
    }

    public static List<Computer> listProducts() {
        List<Computer> listComputer = new ArrayList<>();
        Connection getConnection = DBUtil.ConnectionString();
        String  sql = "SELECT * FROM Computer";
        try {
            Statement statement = getConnection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String kind = resultSet.getString(3);
                String color = resultSet.getString(4);
                String price = resultSet.getString(5);
                String cpu = resultSet.getString(6);
                String ram = resultSet.getString(7);
                String graphicCard = resultSet.getString(8);
                String memory = resultSet.getString(9);
                String pin = resultSet.getString(10);
                String screen = resultSet.getString(11);
                String image = resultSet.getString(12);

                Computer product = new Computer(id,name, kind, color, price, cpu, ram, graphicCard, memory, pin, screen, image);
                listComputer.add(product);
            }
        } catch (SQLException e) {
            System.out.println("Statement " + e.getMessage());
        }
        return listComputer;
    }
}
