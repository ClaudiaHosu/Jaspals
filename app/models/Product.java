package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by claudia on 07/11/2015.
 */
@Entity
public class Product extends Model {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public String id;

    public String name;

}
