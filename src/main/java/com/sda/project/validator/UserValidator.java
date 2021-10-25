package com.sda.project.validator;

import com.sda.project.dto.UserDto;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

@Service
public class UserValidator {
    public void validate(UserDto userDto, BindingResult bindingResult) {
        FieldError fieldError = new FieldError("userDto", "email", "Email Must Include @ Symbol");
        bindingResult.addError(fieldError);
    }


}
