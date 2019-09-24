package sourceCode.java8.stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


/*
 Streams can be obtained in a number of ways. 
 Some examples include: 
 1•From a Collection via the stream() and parallelStream() methods;
 2•From an array via Arrays.stream(Object[]);
 3•From static factory methods on the stream classes, such as Stream.of(Object[]), 
 IntStream.range(int, int) or Stream.iterate(Object, UnaryOperator);
 4•The lines of a file can be obtained from BufferedReader.lines();
 5•Streams of file paths can be obtained from methods in Files;
 6•Streams of random numbers can be obtained from Random.ints();
 7•Numerous other stream-bearing methods in the JDK, including BitSet.stream(), 
 Pattern.splitAsStream(java.lang.CharSequence), and JarFile.stream().

 Additional stream sources can be provided by third-party libraries using these techniques. 

 */
public class WayToGetStream
{

	public static void main(String[] args)
	{
		getStreamUsingCollection_stream();
		getStreamUsingCollection_parallelStream();
		getStreamUsingArrays_stream();
		getStreamUsingStream_of();
		getStreamUsingIntStream_range();
		//getStreamUsingBufferedReader_lines();
		//getStreamUsingFile_Stream_Extra();
		//getStreamUsingBufferedReader_Stream();
		getStreamUsingRandom_ints();
	}

	// 1.1 getting stream using Collection via stream()
	public static void getStreamUsingCollection_stream()
	{
		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 43, 56, 23, 75, 54, 89, 24, 90, 69);
		list.stream().sorted().forEach((m) -> System.out.print(m + " "));
		System.out.println();
	}

	// 1.2 getting stream using Collection via parallelStream()
	public static void getStreamUsingCollection_parallelStream()
	{
		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 43, 56, 23, 75, 54, 89, 24, 90, 69);
		System.out.println("count :" + list.parallelStream().count());
	}

	// 2 From an array via Arrays.stream(Object[]);
	public static void getStreamUsingArrays_stream()
	{
		double d[] = { 43, 56, 21, 9, 78, 32, 2, 13, 87, 56 };
		// Arrays.stream(d).sorted().forEach(System.out::println);
		Arrays.stream(d).sorted().forEach((r) -> System.out.print(r + " "));
	}

	// 3.1 From static factory methods on the stream classes,such as
	// Stream.of(Object[]),
	public static void getStreamUsingStream_of()
	{
		int b[] = { 76, 34, 2, 45, 232, 45, 5667, 32 };
		Stream.of(b).sorted().forEach((m) -> System.out.println(m + " "));
	}

	// 3.2 For IntStream.range(int, int) or Stream.iterate(Object,
	// UnaryOperator);
	public static void getStreamUsingIntStream_range()
	{
		IntStream.range(0, 7).forEach((m) -> System.out.print(m + " "));
		System.out.println();

		Stream.iterate(1, n -> n + 1).limit(10)
				.forEach(x -> System.out.print(x + " "));
		System.out.println();

		Stream.iterate(0, n -> n + 1).filter(x -> x % 2 != 0) // odd
				.limit(10).forEach(x -> System.out.print(x + " "));
		System.out.println();

		Stream.iterate(10, n -> n + 2).limit(10)
				.forEach(d -> System.out.print(d + " "));
		System.out.println();

		// fabinoci series
		Stream.iterate(new int[] { 0, 1 }, n -> new int[] { n[1], n[0] + n[1] })
				.limit(20).map(n -> n[0])
				.forEach(x -> System.out.print(x + " "));
		System.out.println();
	}

	// 4.1•The lines of a file can be obtained from BufferedReader.lines();
	public static void getStreamUsingBufferedReader_lines()
	{
		System.out.println("-----------");
		String filePath = "D:\\Work\\NewWorkSpace13Dec\\Learn Project\\src\\sourceCode\\java8\\stream";
		String fileName = filePath + "\\" + "InputFile.txt";

		// read file into stream, try-with-resources
		try (Stream<String> stream = Files.lines(Paths.get(fileName)))
		{
			stream.forEach(System.out::println);

		} catch (IOException e)
		{
			e.printStackTrace();
		}

	}

	//Read File + Stream + Extra
	public static void getStreamUsingFile_Stream_Extra()
	{
		String filePath = "D:\\Work\\NewWorkSpace13Dec\\Learn Project\\src\\sourceCode\\java8\\stream";
		String fileName = filePath + "\\" + "InputFile.txt";
		List<String> list = new ArrayList<>();

		try (Stream<String> stream = Files.lines(Paths.get(fileName)))
		{

			// 1. filter line 3
			// 2. convert all content to upper case
			// 3. convert it into a List
			list = stream.filter(line -> !line.startsWith("this is line16"))
					.map(String::toUpperCase).collect(Collectors.toList());

		} catch (IOException e)
		{
			e.printStackTrace();
		}

		list.forEach(System.out::println);

	}
	
	public static void getStreamUsingBufferedReader_Stream()
	{
		String filePath = "D:\\Work\\NewWorkSpace13Dec\\Learn Project\\src\\sourceCode\\java8\\stream";
		String fileName = filePath + "\\" + "InputFile.txt";
		
		List<String> list = new ArrayList<>();

		try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {

			//br returns as stream and convert it into a List
			list = br.lines().collect(Collectors.toList());

		} catch (IOException e) {
			e.printStackTrace();
		}
	
		list.forEach(System.out::println);
	}

	public static void getStreamUsingRandom_ints()
	{
		//new Random().ints(10, 33, 38).forEach(System.out::println);
		Random r = new Random();
		Stream s = (Stream) r.ints(10, 33, 38);
		
		s.forEach(System.out::println);
		
	}
}
