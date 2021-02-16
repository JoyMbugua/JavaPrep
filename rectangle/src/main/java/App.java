import models.Cube;
import models.Rectangle;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class App {

    public static void main(String[] args) {
        staticFileLocation("/public");

        get("/", (request, response) -> {
            Map<String, ArrayList<Rectangle>> model = new HashMap<>();

            ArrayList myRectangleArrayList = Rectangle.getAll();

            model.put("myRectangles", myRectangleArrayList);
            return new ModelAndView(model, "index.hbs");

        }, new HandlebarsTemplateEngine());

        post("/rectangles/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();

            int height = Integer.parseInt(request.queryParams("height"));

            int width = Integer.parseInt(request.queryParams("width"));

            Rectangle myRectangle = new Rectangle(height, width);

            model.put("myRectangle", myRectangle);

            if(myRectangle.getShape()) {
                Cube myCube = new Cube(myRectangle);
                model.put("myCube", myCube);
            }
            return new ModelAndView(model, "rectangle-detail.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
