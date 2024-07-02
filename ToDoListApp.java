import java.util.ArrayList;
import java.util.Scanner;
public class ToDoListApp 
{
private static ArrayList<String> tasks = new ArrayList<>();
private static Scanner scanner = new Scanner(System.in);
public static void main(String[] args) 
{
boolean exit = false;
while (!exit) 
{
printMenu();
int choice = scanner.nextInt();
scanner.nextLine(); 
switch (choice) 
{
case 1:
addTask();
break;
case 2:
editTask();
break;
case 3:
deleteTask();
break;
case 4:
listTasks();
break;
case 5:
exit = true;
System.out.println("Exiting program...");
break;
default:
System.out.println("Invalid choice. Please enter a number between 1 and 5.");
break;
}
}
scanner.close();
}
private static void printMenu() 
{
System.out.println("\n===== To-Do List Application Menu =====");
System.out.println("1. Add Task");
System.out.println("2. Edit Task");
System.out.println("3. Delete Task");
System.out.println("4. List All Tasks");
System.out.println("5. Exit");
System.out.print("Enter your choice: ");
}
private static void addTask() 
{
System.out.print("Enter task to add: ");
String task = scanner.nextLine();
tasks.add(task);
System.out.println("Task added successfully.");
}
private static void editTask() 
{
System.out.print("Enter index of task to edit (1 to " + tasks.size() + "): ");
int index = scanner.nextInt();
scanner.nextLine();
if (index >= 1 && index <= tasks.size()) 
{
System.out.print("Enter new task description: ");
String newTask = scanner.nextLine();
tasks.set(index - 1, newTask);
System.out.println("Task updated successfully.");
}
else 
{
System.out.println("Invalid index. No task found to edit.");
}
}
private static void deleteTask() 
{
System.out.print("Enter index of task to delete (1 to " + tasks.size() + "): ");
int index = scanner.nextInt();
scanner.nextLine(); 
if (index >= 1 && index <= tasks.size()) 
{
tasks.remove(index - 1);
System.out.println("Task deleted successfully.");
} 
else 
{
System.out.println("Invalid index. No task found to delete.");
}
}
private static void listTasks() 
{
if (tasks.isEmpty()) 
{
System.out.println("No tasks found.");
} 
else 
{
System.out.println("\nTasks:");
for (int i = 0; i < tasks.size(); i++) 
{
System.out.println((i + 1) + ". " + tasks.get(i));
}
}
}
}
