import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Converter<UserDto, User> userConverter = new UserConverter();

        UserDto userDto = new UserDto("John", "Doe", true, "flow1074@gmail.com");
        User user = userConverter.convertFromDto(userDto);
        System.out.println("Entity converted from DTO:");
        System.out.println(user);
        System.out.println();

        ArrayList<User> users = Lists.newArrayList(
                new User("Camile", "Tough", false, "124sad"),
                new User("Marti", "Luther", true, "42309fd"),
                new User("Kate", "Smith", true, "if0243")
        );
        System.out.println("Domain entities:");
        users.forEach(System.out::println);
        System.out.println();

        System.out.println("DTO entities converted from domain:");
        List<UserDto> entitiesDto = userConverter.createFromEntities(users);
        entitiesDto.forEach(System.out::println);
    }
}
