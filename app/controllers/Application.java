package controllers;

import models.Product;
import play.mvc.*;
import play.db.jpa.*;
import views.html.*;
import play.data.Form;
import java.util.List;

import static play.libs.Json.*;

public class Application extends Controller {

    public Result index() {
        return ok(index.render());
    }

    public Result about() { return ok (about.render()); }

    public  Result products() {return ok(products.render());}

    @Transactional
    public Result addProduct() {
        Product product = Form.form(Product.class).bindFromRequest().get();
        JPA.em().persist(product);
        return redirect(routes.Application.products());
    }

    @Transactional(readOnly = true)
    public Result getProducts() {
        //List<Product> persons = (List<Product>) JPA.em().createQuery("select p from Person p").getResultList();
        return ok();
    }
}
