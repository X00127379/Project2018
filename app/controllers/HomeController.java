package controllers;
import play.mvc.*;
import views.html.*;

public class HomeController extends Controller {

    public Result index() {
        return ok(index.render());
    }

    public Result about() {
        return ok(about.render());
    }

    public Result products() {
        return ok(products.render());
    }

}


