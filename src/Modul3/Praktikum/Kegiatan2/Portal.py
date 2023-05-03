class Node:
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next

class Queue:
    def __init__(self):
        self.head = None
        self.tail = None
        self.size = 0

    def enqueue(self, data):
        new_node = Node(data)

        if self.head is None:
            self.head = new_node
            self.tail = new_node
        else:
            self.tail.next = new_node
            self.tail = new_node

        self.size += 1

    def dequeue(self):
        if self.head is None:
            return None

        data = self.head.data
        self.head = self.head.next
        self.size -= 1

        return data

    def peek(self):
        if self.head is None:
            return None

        return self.head.data

    def is_empty(self):
        return self.head is None

    def size(self):
        return self.size

    def delete(self, index):
        if index < 0 or index >= self.count:
            return None

        if index == 0:
            value = self.head.value
            self.head = self.head.next

            if self.head is None:
                self.tail = None

            self.count -= 1
            return value

        current = self.head
        for i in range(index - 1):
            current = current.next

        value = current.next.value
        current.next = current.next.next

        if current.next is None:
            self.tail = current

        self.count -= 1
        return value

class Mahasiswa:
    def __init__(self, nim, nama, jurusan):
        self.nim = nim
        self.nama = nama
        self.jurusan = jurusan

    def __str__(self):
        return f"NIM: {self.nim}, Nama: {self.nama}, Jurusan: {self.jurusan}"

def main():

    mahasiswa_queue = Queue()

    while True:
        print("1: Input Data Mahasiswa")
        print("2: Jumlah Mahasiswa")
        print("3: Daftar Mahasiswa")
        print("0: Exit")

        choice = int(input("Masukkan pilihan: "))

        if choice == 1:
            nim = input("Masukkan NIM: ")
            nama = input("Masukkan Nama Mahasiswa: ")
            jurusan = input("Masukkan Jurusan: ")
            mahasiswa_queue.enqueue(Mahasiswa(nim, nama, jurusan))
            print("Data Mahasiswa Terinput!")
        elif choice == 2:
            print("Jumlah mahasiswa di dalam queue:", mahasiswa_queue.size)
        elif choice == 3:
            while not mahasiswa_queue.is_empty():
                data = mahasiswa_queue.dequeue()
                print(data)
        elif choice == 0:
            break
        else:
            print("Pilihan Salah")


if __name__ == "__main__":
    main()
