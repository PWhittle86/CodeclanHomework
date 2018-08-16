import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;

public class NameController {

    public static void main(String[] args) {

        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        staticFileLocation("/public");

        final ArrayList<Name> namesList = new ArrayList<Name>();

        Name pete = new Name("Peter", "Whittle");
        Name matt = new Name("Matthew", "Lloyd");
        Name jen = new Name("Jennifer", "Whittle");
        Name becky = new Name("Becky", "Drinkwater");
        Name paolo = new Name("Paolo", "Greco");

        namesList.add(pete);
        namesList.add(matt);
        namesList.add(jen);
        namesList.add(becky);
        namesList.add(paolo);

        get("/names/one", (req, res) -> {
            Collections.shuffle(namesList);
            Name selectedName = namesList.get(0);
            String fullName = selectedName.getFullName();

            HashMap<String, Object> model = new HashMap<>();
            model.put("name", fullName);
            model.put("template", "onename.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        get("/names/two", (req, res) -> {
            Collections.shuffle(namesList);
            Name selectedName1 = namesList.get(0);
            Name selectedName2 = namesList.get(1);
            String fullName1 = selectedName1.getFullName();
            String fullName2 = selectedName2.getFullName();

            HashMap<String, Object> model = new HashMap<>();
            model.put("name1", fullName1);
            model.put("name2", fullName2);
            model.put("template", "twonames.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        get("/names/three", (req, res) -> {
            Collections.shuffle(namesList);
            Name selectedName1 = namesList.get(0);
            Name selectedName2 = namesList.get(1);
            Name selectedName3 = namesList.get(2);
            String fullName1 = selectedName1.getFullName();
            String fullName2 = selectedName2.getFullName();
            String fullName3 = selectedName3.getFullName();

            HashMap<String, Object> model = new HashMap<>();
            model.put("name1", fullName1);
            model.put("name2", fullName2);
            model.put("name3", fullName3);
            model.put("template", "threenames.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        get("/names/four", (req, res) -> {
            Collections.shuffle(namesList);
            Name selectedName1 = namesList.get(0);
            Name selectedName2 = namesList.get(1);
            Name selectedName3 = namesList.get(2);
            Name selectedName4 = namesList.get(3);
            String fullName1 = selectedName1.getFullName();
            String fullName2 = selectedName2.getFullName();
            String fullName3 = selectedName3.getFullName();
            String fullName4 = selectedName4.getFullName();

            HashMap<String, Object> model = new HashMap<>();
            model.put("name1", fullName1);
            model.put("name2", fullName2);
            model.put("name3", fullName3);
            model.put("name4", fullName4);
            model.put("template", "fournames.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

    }

}
