package com.fasteducation.feedbackmicroservice.resource;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class QueryResource {

    private int c_query_id;
    private String D_description;
    private String D_title;
    private int Teachers_Users_C_user_id;
    private int Courses_C_course_id;
    private int Courses_Routes_C_route_id;
}