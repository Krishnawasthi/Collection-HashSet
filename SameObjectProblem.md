<img width="703" height="211" alt="image" src="https://github.com/user-attachments/assets/3430f1c8-4e37-4a17-98e3-b658bccc9d05" />

### when there are multiple objects and their fields same:
### scenerio1: first it will Store different attributes at different position because it will consider each Object as different even though their Attributes are same.
<img width="677" height="260" alt="image" src="https://github.com/user-attachments/assets/b4896228-cf49-469f-be07-d3e0232c4c7f" />

### three different object at three different memory location. each object has their own hashcode.

### scenerio2: When We override the hashCode() from Object class:  this will give same hashcode for each Object.
<img width="826" height="154" alt="image" src="https://github.com/user-attachments/assets/7c3ee2bc-4c5e-4062-b75f-213f1603d654" />

### now the object will share same hashCode but there will be collision because each object has the same attributes but it is not comparing the Attributes so it will make a linkedlist and store 3 different attributes. becuase it is not comparing value.

<img width="785" height="397" alt="image" src="https://github.com/user-attachments/assets/be34e28d-ccc3-4339-a0fc-f38dbc14e053" />

### All the elements on the 9th bucket but sharing a linkedlist even when they have same attributes. 

### scenerio2: now Override the equals() method from object class and making comparing the elements then it will store all the attributes of different objects at perticular index.

<img width="789" height="140" alt="image" src="https://github.com/user-attachments/assets/2a00535f-1b17-4914-b2a4-4d30b2c7d388" />

<img width="936" height="207" alt="image" src="https://github.com/user-attachments/assets/fc706927-4304-49c9-8941-09bceb3f3fd2" />

### now Attributes are at same bucket.  

<img width="712" height="126" alt="image" src="https://github.com/user-attachments/assets/e7248ed8-3cb2-4c32-8a5b-87fea9a1d4c1" />

## All sharing same hashcode.



## follow code: com.collection.hashset.differenthashcode for more understanding.
