- 将数组变为链表
```java
    Arrays.asList(nums[i],nums[l],nums[r]);
```
- 字符串数组转string
```java
String.valueOf(chars);
```
- list可用set初始化
```java
List<Character> list = new ArrayList<>(map.keySet());
```
- list排序
```java
//降序
Collections.sort(list,(a,b)-> map.get(b)-map.get(a))
```
- String重复添加字符
```java
sb.append(String.valueOf(c).repeat(f));
```
