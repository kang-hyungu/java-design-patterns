import java.util.function.Function;

public class UserConverter extends Converter<UserDto, User> {

    public UserConverter() {
        super(userDto -> new User(userDto.getFirstName(),
                                  userDto.getLastName(),
                                  userDto.isActive(),
                                  userDto.getEmail()),

              user -> new UserDto(user.getFirstName(),
                                  user.getLastName(),
                                  user.isActive(),
                                  user.getUserId()));
    }
}
