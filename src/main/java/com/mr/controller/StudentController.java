package com.mr.controller;

import com.mr.entity.Student;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@Controller
@RequestMapping("/StudentController")
public class StudentController {
    public static void main(String[] args) {
        System.out.println(123);
    }
}