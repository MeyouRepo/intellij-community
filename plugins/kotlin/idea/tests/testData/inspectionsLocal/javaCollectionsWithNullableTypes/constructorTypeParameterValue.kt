// WITH_STDLIB
// PROBLEM: Java collection 'ConcurrentHashMap' is parameterized with a nullable type
import java.util.concurrent.ConcurrentHashMap

val map = ConcurrentHashMap<String, String?<caret>>()