package cz.czechitas.java2webapps.lekce7.service;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/**
 * @author Filip Jirsák
 */
public class CalendarDTO implements List<DateDTO> {
    private final List<DateDTO> list = new LinkedList<>();

    public CalendarDTO append(String label, LocalDate date) {
        list.add(new DateDTO(label, date));
        return this;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return list.contains(o);
    }

    @Override
    public Object[] toArray() {
        return list.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return list.toArray(a);
    }

    @Override
    public boolean add(DateDTO dateDTO) {
        return list.add(dateDTO);
    }

    @Override
    public boolean remove(Object o) {
        return list.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return list.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends DateDTO> c) {
        return list.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends DateDTO> c) {
        return list.addAll(index, c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return list.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return list.retainAll(c);
    }

    @Override
    public void replaceAll(UnaryOperator<DateDTO> operator) {
        list.replaceAll(operator);
    }

    @Override
    public void sort(Comparator<? super DateDTO> c) {
        list.sort(c);
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public boolean equals(Object o) {
        return list.equals(o);
    }

    @Override
    public int hashCode() {
        return list.hashCode();
    }

    @Override
    public DateDTO get(int index) {
        return list.get(index);
    }

    @Override
    public DateDTO set(int index, DateDTO element) {
        return list.set(index, element);
    }

    @Override
    public void add(int index, DateDTO element) {
        list.add(index, element);
    }

    @Override
    public DateDTO remove(int index) {
        return list.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return list.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return list.lastIndexOf(o);
    }

    @Override
    public ListIterator<DateDTO> listIterator() {
        return list.listIterator();
    }

    @Override
    public ListIterator<DateDTO> listIterator(int index) {
        return list.listIterator(index);
    }

    @Override
    public List<DateDTO> subList(int fromIndex, int toIndex) {
        return list.subList(fromIndex, toIndex);
    }

    @Override
    public Spliterator<DateDTO> spliterator() {
        return list.spliterator();
    }

    @Override
    public void addFirst(DateDTO dateDTO) {
        list.addFirst(dateDTO);
    }

    @Override
    public void addLast(DateDTO dateDTO) {
        list.addLast(dateDTO);
    }

    @Override
    public DateDTO getFirst() {
        return list.getFirst();
    }

    @Override
    public DateDTO getLast() {
        return list.getLast();
    }

    @Override
    public DateDTO removeFirst() {
        return list.removeFirst();
    }

    @Override
    public DateDTO removeLast() {
        return list.removeLast();
    }

    @Override
    public List<DateDTO> reversed() {
        return list.reversed();
    }

    @Override
    public <T> T[] toArray(IntFunction<T[]> generator) {
        return list.toArray(generator);
    }

    @Override
    public boolean removeIf(Predicate<? super DateDTO> filter) {
        return list.removeIf(filter);
    }

    @Override
    public Stream<DateDTO> stream() {
        return list.stream();
    }

    @Override
    public Stream<DateDTO> parallelStream() {
        return list.parallelStream();
    }

    @Override
    public void forEach(Consumer<? super DateDTO> action) {
        list.forEach(action);
    }

    @Override
    public Iterator<DateDTO> iterator() {
        return list.iterator();
    }

    public LocalDate getFirstDay() {
        return list.getFirst().date();
    }

    public LocalDate getLastDay() {
        return list.getLast().date();
    }
}
