package com.mrjaffesclass.apcs.todolist;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * To do item
 * 
 * @author Jordan, Spenser, Haley
 * @version final
 */
public class ToDoItem {

  /**
   * id:          ID number of to do item. Assigned when added to list
   * description: Description of to do item
   * done:        True if to do item is complete
   * date:        Allows the date to be edited
   * sdf:         Date picker format for new items
   */
  private int id;               
  private String description;
  private boolean done;
  private Date date = new Date();
  private SimpleDateFormat sdf = new SimpleDateFormat("EEE, MMM d");
  
  /**
   * Constructor with done set to false in constructor
   * @param _id           ID number of to do item
   * @param _description  Description of to do item
   * @param _date;        Date of to do item
   */
  public ToDoItem(int _id, String _description, Date _date) {
    description = _description;
    id = _id;
    done = false;     
    date = _date;
  }

  /**
   * Constructor
   * @param _id           ID number of to do item
   * @param _description  Description of to do item
   * @param _done         Done flag
   */
  public ToDoItem(int _id, String _description, boolean _done) {
    description = _description;
    id = _id;
    done = _done;     // Default to not completed
  }
  
  /**
   * Constructor
   * @param _id           ID number of to do item
   * @param _description  Description of to do item
   */
  public ToDoItem(int _id, String _description) {
    description = _description;
    id = _id;
    done = false;     // Default to not completed
  }
  
 
  
  /**
   * Get the to do item description
   * @return The description of to do item
   */
  public String getDescription() {
    return description;
  }
  /**
   * Get the to do item date
   * @return The date from the string
   */
  public String getStringDate() {
      return sdf.format(date);
  }
  /**
   * Get the to do item date
   * @return The date of to do item
   */
  public Date getDate()
  {
      return date;
  }

  /**
   * Set the to do item description
   * @param description The value to be set
   */
  public void setDescription(String description) {
    this.description = description;
  }
  /**
   * Set the to do item date
   * @param date The date to be set
   */
  public void setDate(Date date){
      this.date = date;
  }

  /**
   * Get the done flag
   * @return The done flag
   */
  public boolean isDone() {
    return done;
  }

  /**
   * Set the done flag
   * @param done The value to be set
   */
  public void setDone(boolean done) {
    this.done = done;
  }
  
  /**
   * Toggles the done flag
   */
  public void toggleDone() {
    this.done = !this.done;
  }

  /**
   * Get the to do item ID
   * @return ID of the to do item
   */
  public int getId() {
    return id;
  }
  
  /**
   * Sets the ID of the to do item. Can only be called from inside this class
   * @param id ID value to set
   */
  public void setId(int id) {
    this.id = id;
  }
  
  /**
   * Transfer the description and done flag of another to do item into this one
   * @param anotherItem Item whose data values we are copying
   */
  public void merge(ToDoItem anotherItem) {
    this.setDescription(anotherItem.getDescription());
    this.setDone(anotherItem.isDone()); 
    this.setDate(anotherItem.getDate());
    
  }

}
