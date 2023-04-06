class HashMap:
    def __init__(self):
        self.size = 16
        self.map = [None] * self.size

    def _get_hash(self, key):
        return hash(key) % self.size

    def add(self, key, value):
        key_hash = self._get_hash(key)
        key_value = [key, value]

        if self.map[key_hash] is None:
            self.map[key_hash] = list([key_value])
            return True
        else:
            for pair in self.map[key_hash]:
                if pair[0] == key:
                    pair[1] = value
                    return True
            self.map[key_hash].append(key_value)
            return True

    def get(self, key):
        key_hash = self._get_hash(key)

        if self.map[key_hash] is not None:
            for pair in self.map[key_hash]:
                if pair[0] == key:
                    return pair[1]
        return None

    def delete(self, key):
        key_hash = self._get_hash(key)

        if self.map[key_hash] is None:
            return False

        for i in range(len(self.map[key_hash])):
            if self.map[key_hash][i][0] == key:
                self.map[key_hash].pop(i)
                return True
        return False

    def print_map(self):
        for item in self.map:
            if item is not None:
                print(str(item))

my_map = HashMap()

while True:
    print("1: Input Data Mahasiswa")
    print("2: Cari Mahasiswa")
    print("3: Hapus Mahasiswa")
    print("4: Daftar Mahasiswa")
    print("5: Exit")

    choice = int(input("Masukkan pilihan: "))

    if choice == 1:
        key = input("Masukkan NIM: ")
        value = input("Masukkan Nama Mahasiswa: ")
        my_map.add(key, value)
        print("Data Mahasiswa Terinput!")
    elif choice == 2:
        key = input("Masukkan NIM: ")
        value = my_map.get(key)
        if value is not None:
            print(f"{key}, {value}")
        else:
            print(f"NIM Tidak Terdaftar")
    elif choice == 3:
        key = input("Masukkan NIM: ")
        success = my_map.delete(key)
        if success:
            print(f"Mahasiswa dengan NIM '{key}'  berhasil dihapus!")
        else:
            print(f"NIM tidak terdaftar")
    elif choice == 4:
        print("Daftar Mahasiswa:")
        my_map.print_map()
    elif choice == 5:
        break
    else:
        print("Pilihan Salah")
