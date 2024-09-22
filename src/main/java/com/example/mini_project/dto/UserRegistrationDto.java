package com.example.mini_project.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class UserRegistrationDto {

    @NotBlank(message = "사용하실 아이디를 입력하세요.")
    @Size(min = 6, max = 20, message = "아이디는 6자이상 20자 이하여야 합니다.")
    private String userId;

    @NotBlank(message = "비밀번호를 입력하세요.")
    @Size(min = 8, max = 20)
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$",
            message = "비밀번호는 대문자, 소문자, 숫자를 모두 포함해야 합니다.")
    @NotBlank(message = "비밀번호를 입력하세요.")
    @Size(min = 8, max = 20)
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$",
            message = "비밀번호는 대문자, 소문자, 숫자를 모두 포함해 8자 이상 20자 이하여야 합니다.")
    private String userPw;

    @NotBlank(message = "이름을 입력하세요.")
    private String userName;

    @NotBlank(message = "사용하실 닉네임을 입력하세요.")
    @Size(min = 6, max = 15, message = "닉네임은 6글자 이상 15글자 이하만 가능합니다.")
    private String userNickname;

    @NotBlank(message = "사용 가능한 이메일을 입력하세요.")
    @Email(message = "유효한 메일 주소여야 합니다.")
    private String userEmail;

    @NotBlank(message = "사용 가능한 연락처를 입력하세요.")
    @Pattern(regexp ="^[0-9]{10,11}$", message = "전화번호는 10자리 또는 11자리 숫자여야 합니다.")
    private String userPhoneNumber;

}
