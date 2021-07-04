package io.julioamorim.producer;

import io.julioamorim.model.Address;
import io.julioamorim.model.User;

public class Producer {

    public static void main(String[] args) {
        Address address = new Address("Rua bom jesus, Recife - PE", 222, "54000-000");
        User user = new User((long) 1, "Júlio", "Amorim", 1994,
                9, 16, "julioamorim@github.io", address);

        Address newAddress = new Address("Rua domingos savio", 12, "53000-000");

        new UserService().updateUser(user, newAddress);
    }
}
