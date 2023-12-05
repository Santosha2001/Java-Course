package com.xworkz.collection.disease.boot;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collection.disease.app.dto.DiseasesDTO;

public class DiseasesMain {

	public static void main(String[] args) {

		DiseasesDTO disease1 = new DiseasesDTO(130.0, 85.0, 120.0, 27.5, 120.0, 55.0, 175.0, 500, 4, 2.5,
				LocalDate.of(2000, 1, 1));
		DiseasesDTO disease2 = new DiseasesDTO(140.0, 90.0, 130.0, 28.0, 130.0, 60.0, 180.0, 600, 5, 3.0,
				LocalDate.of(1985, 5, 15));
		DiseasesDTO disease3 = new DiseasesDTO(120.0, 80.0, 110.0, 26.0, 110.0, 50.0, 170.0, 450, 3, 2.0,
				LocalDate.of(1995, 8, 22));
		DiseasesDTO disease4 = new DiseasesDTO(125.0, 82.0, 115.0, 26.5, 115.0, 52.0, 172.0, 480, 3, 2.2,
				LocalDate.of(1980, 3, 10));
		DiseasesDTO disease5 = new DiseasesDTO(135.0, 88.0, 125.0, 28.5, 125.0, 58.0, 178.0, 550, 4, 2.8,
				LocalDate.of(1998, 11, 5));
		DiseasesDTO disease6 = new DiseasesDTO(128.0, 84.0, 118.0, 27.0, 118.0, 54.0, 176.0, 520, 4, 2.7,
				LocalDate.of(1982, 7, 12));
		DiseasesDTO disease7 = new DiseasesDTO(132.0, 86.0, 122.0, 28.8, 122.0, 56.0, 178.0, 530, 4, 2.6,
				LocalDate.of(1990, 4, 30));
		DiseasesDTO disease8 = new DiseasesDTO(145.0, 92.0, 135.0, 30.0, 135.0, 62.0, 185.0, 620, 6, 3.5,
				LocalDate.of(1975, 9, 18));
		DiseasesDTO disease9 = new DiseasesDTO(118.0, 78.0, 108.0, 25.5, 108.0, 48.0, 168.0, 430, 2, 1.8,
				LocalDate.of(2005, 2, 25));
		DiseasesDTO disease10 = new DiseasesDTO(142.0, 91.0, 132.0, 29.5, 132.0, 64.0, 182.0, 590, 5, 3.2,
				LocalDate.of(1987, 6, 8));

		DiseasesDTO disease11 = new DiseasesDTO(115.0, 76.0, 105.0, 24.0, 105.0, 46.0, 165.0, 400, 1, 1.5,
				LocalDate.of(1992, 10, 15));
		DiseasesDTO disease12 = new DiseasesDTO(148.0, 94.0, 138.0, 31.0, 138.0, 66.0, 188.0, 640, 7, 3.8,
				LocalDate.of(1989, 8, 5));
		DiseasesDTO disease13 = new DiseasesDTO(122.0, 79.0, 112.0, 26.8, 112.0, 52.0, 174.0, 470, 3, 2.3,
				LocalDate.of(1993, 3, 22));
		DiseasesDTO disease14 = new DiseasesDTO(130.0, 84.0, 120.0, 27.7, 120.0, 56.0, 176.0, 510, 4, 2.6,
				LocalDate.of(1984, 12, 12));
		DiseasesDTO disease15 = new DiseasesDTO(138.0, 89.0, 128.0, 29.0, 128.0, 60.0, 182.0, 580, 5, 3.1,
				LocalDate.of(1997, 7, 8));
		DiseasesDTO disease16 = new DiseasesDTO(124.0, 81.0, 114.0, 26.3, 114.0, 54.0, 172.0, 490, 3, 2.1,
				LocalDate.of(1981, 5, 30));
		DiseasesDTO disease17 = new DiseasesDTO(136.0, 87.0, 126.0, 28.2, 126.0, 58.0, 180.0, 560, 5, 3.0,
				LocalDate.of(1996, 2, 18));
		DiseasesDTO disease18 = new DiseasesDTO(117.0, 77.0, 107.0, 25.0, 107.0, 48.0, 166.0, 420, 2, 1.7,
				LocalDate.of(2002, 11, 10));
		DiseasesDTO disease19 = new DiseasesDTO(144.0, 93.0, 134.0, 30.5, 134.0, 62.0, 184.0, 610, 6, 3.4,
				LocalDate.of(1978, 4, 2));
		DiseasesDTO disease20 = new DiseasesDTO(126.0, 83.0, 116.0, 27.2, 116.0, 54.0, 174.0, 500, 4, 2.4,
				LocalDate.of(1994, 9, 25));

		DiseasesDTO disease21 = new DiseasesDTO(131.0, 82.0, 123.0, 27.5, 122.0, 25.0, 275.0, 500, 4, 2.5,
				LocalDate.of(2001, 1, 1));
		DiseasesDTO disease22 = new DiseasesDTO(141.0, 92.0, 130.0, 28.2, 133.0, 60.0, 280.0, 600, 5, 3.0,
				LocalDate.of(1912, 5, 15));
		DiseasesDTO disease23 = new DiseasesDTO(121.0, 82.0, 114.0, 26.0, 116.0, 20.0, 270.0, 450, 3, 2.0,
				LocalDate.of(1989, 8, 22));
		DiseasesDTO disease24 = new DiseasesDTO(121.0, 82.0, 115.0, 26.8, 118.0, 22.0, 272.0, 480, 3, 2.2,
				LocalDate.of(1954, 3, 10));
		DiseasesDTO disease25 = new DiseasesDTO(131.0, 88.0, 125.0, 28.7, 128.0, 28.0, 278.0, 550, 4, 2.8,
				LocalDate.of(1944, 11, 5));
		DiseasesDTO disease26 = new DiseasesDTO(121.0, 82.0, 115.0, 27.2, 112.0, 24.0, 276.0, 520, 4, 2.7,
				LocalDate.of(1956, 7, 12));
		DiseasesDTO disease27 = new DiseasesDTO(131.0, 82.0, 122.0, 28.7, 121.0, 26.0, 278.0, 530, 4, 2.6,
				LocalDate.of(1977, 4, 30));
		DiseasesDTO disease28 = new DiseasesDTO(141.0, 92.0, 136.0, 30.5, 135.0, 22.0, 285.0, 620, 6, 3.5,
				LocalDate.of(1933, 9, 18));
		DiseasesDTO disease29 = new DiseasesDTO(111.0, 72.0, 108.0, 25.32, 108.10, 28.0, 168.0, 430, 2, 1.8,
				LocalDate.of(2015, 2, 25));
		DiseasesDTO disease30 = new DiseasesDTO(141.0, 92.0, 137.0, 29.3, 122.0, 24.0, 282.0, 590, 5, 3.2,
				LocalDate.of(1937, 6, 8));

		DiseasesDTO disease31 = new DiseasesDTO(113.0, 76.1, 102.0, 24.0, 125.0, 46.1, 162.0, 410, 1, 1.2,
				LocalDate.of(1991, 10, 15));
		DiseasesDTO disease32 = new DiseasesDTO(143.0, 94.6, 132.0, 11.0, 138.0, 66.0, 183.0, 690, 5, 3.2,
				LocalDate.of(1981, 8, 5));
		DiseasesDTO disease33 = new DiseasesDTO(123.0, 79.4, 112.0, 96.8, 162.0, 52.9, 174.0, 480, 6, 2.2,
				LocalDate.of(1991, 3, 22));
		DiseasesDTO disease34 = new DiseasesDTO(133.0, 84.3, 122.0, 97.7, 180.0, 56.8, 175.0, 560, 2, 2.2,
				LocalDate.of(1981, 12, 12));
		DiseasesDTO disease35 = new DiseasesDTO(135.0, 89.9, 122.0, 89.0, 198.0, 60.6, 186.0, 550, 5, 3.2,
				LocalDate.of(1991, 7, 8));
		DiseasesDTO disease36 = new DiseasesDTO(126.0, 81.8, 112.0, 76.3, 134.0, 54.5, 177.0, 430, 6, 2.2,
				LocalDate.of(1981, 5, 30));
		DiseasesDTO disease37 = new DiseasesDTO(137.0, 87.6, 1620, 68.2, 126.0, 58.3, 188.0, 550, 7, 3.2,
				LocalDate.of(1991, 2, 18));
		DiseasesDTO disease38 = new DiseasesDTO(118.0, 77.5, 107.0, 55.0, 157.0, 46.2, 169.0, 440, 7, 1.2,
				LocalDate.of(2001, 11, 10));
		DiseasesDTO disease39 = new DiseasesDTO(14.0, 93.0, 154.0, 40.5, 144.0, 65.0, 180.0, 620, 6, 3.2,
				LocalDate.of(1978, 4, 2));
		DiseasesDTO disease40 = new DiseasesDTO(196.0, 83.3, 156.0, 37.2, 126.0, 52.0, 172.0, 200, 4, 2.2,
				LocalDate.of(1923, 9, 25));

		DiseasesDTO disease41 = new DiseasesDTO(330.0, 85.0, 420.0, 27.5, 120.0, 55.5, 175.8, 530, 4, 2.5,
				LocalDate.of(2021, 1, 1));
		DiseasesDTO disease42 = new DiseasesDTO(340.0, 60.0, 330.0, 28.0, 130.0, 60.3, 180.3, 660, 5, 3.0,
				LocalDate.of(189, 5, 15));
		DiseasesDTO disease43 = new DiseasesDTO(320.0, 60.0, 310.0, 26.0, 110.0, 50.5, 170.3, 400, 3, 2.0,
				LocalDate.of(1455, 8, 22));
		DiseasesDTO disease44 = new DiseasesDTO(325.0, 62.0, 415.0, 26.5, 115.0, 52.7, 172.8, 490, 3, 2.2,
				LocalDate.of(1900, 3, 10));
		DiseasesDTO disease45 = new DiseasesDTO(335.0, 58.0, 325.0, 28.5, 125.0, 58.8, 178.7, 580, 4, 2.8,
				LocalDate.of(1898, 11, 5));
		DiseasesDTO disease46 = new DiseasesDTO(328.0, 44.0, 518.0, 27.0, 118.0, 54.0, 176.6, 550, 4, 2.7,
				LocalDate.of(1982, 7, 12));
		DiseasesDTO disease47 = new DiseasesDTO(332.0, 86.0, 422.0, 28.8, 122.0, 56.6, 178.4, 540, 4, 2.6,
				LocalDate.of(1986, 4, 30));
		DiseasesDTO disease48 = new DiseasesDTO(145.0, 32.0, 535.0, 30.0, 135.0, 62.4, 185.3, 620, 6, 3.5,
				LocalDate.of(1943, 9, 18));
		DiseasesDTO disease49 = new DiseasesDTO(318.0, 38.0, 108.0, 25.5, 108.0, 48.3, 168.2, 430, 2, 1.8,
				LocalDate.of(2021, 2, 25));
		DiseasesDTO disease50 = new DiseasesDTO(334.0, 31.0, 832.0, 29.5, 132.0, 64.3, 182.2, 530, 5, 3.2,
				LocalDate.of(1946, 6, 8));

		DiseasesDTO disease51 = new DiseasesDTO(415.0, 16.0, 305.0, 20.0, 115.0, 41.0, 165.1, 405, 1, 1.5,
				LocalDate.of(1945, 10, 15));
		DiseasesDTO disease52 = new DiseasesDTO(448.0, 24.0, 438.0, 30.0, 118.0, 60.0, 188.1, 645, 7, 3.8,
				LocalDate.of(1977, 8, 5));
		DiseasesDTO disease53 = new DiseasesDTO(522.0, 49.0, 512.0, 20.8, 112.0, 59.0, 174.1, 470, 3, 2.3,
				LocalDate.of(1922, 3, 22));
		DiseasesDTO disease54 = new DiseasesDTO(530.0, 54.0, 720.0, 27.7, 110.0, 56.0, 176.1, 515, 4, 2.6,
				LocalDate.of(1923, 12, 12));
		DiseasesDTO disease55 = new DiseasesDTO(638.0, 89.0, 528.0, 21.0, 118.0, 64.0, 182.1, 585, 5, 3.1,
				LocalDate.of(1978, 7, 8));
		DiseasesDTO disease56 = new DiseasesDTO(624.0, 81.0, 314.0, 22.3, 114.0, 51.0, 172.01, 450, 3, 2.1,
				LocalDate.of(1911, 5, 30));
		DiseasesDTO disease57 = new DiseasesDTO(636.0, 77.0, 126.0, 22.2, 116.0, 51.0, 180.01, 550, 5, 3.0,
				LocalDate.of(1921, 2, 18));
		DiseasesDTO disease58 = new DiseasesDTO(617.0, 57.0, 407.0, 26.0, 117.0, 42.0, 166.1, 425, 2, 1.7,
				LocalDate.of(2012, 11, 10));
		DiseasesDTO disease59 = new DiseasesDTO(544.0, 43.0, 154.0, 33.5, 114.0, 63.0, 184.01, 650, 6, 3.4,
				LocalDate.of(1923, 4, 2));
		DiseasesDTO disease60 = new DiseasesDTO(326.0, 33.0, 186.0, 22.2, 116.0, 55.0, 174.2, 505, 4, 2.4,
				LocalDate.of(1978, 9, 25));

		DiseasesDTO disease61 = new DiseasesDTO(132.0, 35.0, 220.0, 27.3, 130.0, 95.0, 575.0, 550, 3, 2.5,
				LocalDate.of(2020, 1, 1));
		DiseasesDTO disease62 = new DiseasesDTO(142.0, 30.0, 230.0, 28.9, 140.0, 70.0, 380.0, 630, 4, 3.0,
				LocalDate.of(1935, 5, 15));
		DiseasesDTO disease63 = new DiseasesDTO(120.0, 80.0, 310.0, 26.8, 160.0, 40.0, 470.0, 420, 0, 2.0,
				LocalDate.of(1993, 8, 22));
		DiseasesDTO disease64 = new DiseasesDTO(122.0, 92.0, 415.0, 26.7, 175.0, 32.0, 572.0, 480, 3, 2.2,
				LocalDate.of(1930, 3, 10));
		DiseasesDTO disease65 = new DiseasesDTO(132.0, 78.0, 525.0, 28.4, 185.0, 53.0, 378.0, 580, 1, 2.8,
				LocalDate.of(1948, 11, 5));
		DiseasesDTO disease66 = new DiseasesDTO(128.0, 84.0, 518.0, 27.0, 198.0, 59.0, 376.0, 570, 3, 2.7,
				LocalDate.of(1672, 7, 12));
		DiseasesDTO disease67 = new DiseasesDTO(132.0, 26.0, 222.0, 28.3, 192.0, 58.0, 278.0, 560, 9, 2.6,
				LocalDate.of(1890, 4, 30));
		DiseasesDTO disease68 = new DiseasesDTO(126.0, 22.0, 235.0, 30.2, 135.0, 67.0, 385.0, 650, 3, 3.5,
				LocalDate.of(1935, 9, 18));
		DiseasesDTO disease69 = new DiseasesDTO(189.0, 78.0, 408.0, 25.2, 128.0, 46.0, 568.0, 440, 5, 1.8,
				LocalDate.of(2005, 2, 25));
		DiseasesDTO disease70 = new DiseasesDTO(121.0, 71.0, 532.0, 29.3, 132.0, 65.0, 782.0, 530, 6, 3.2,
				LocalDate.of(1947, 6, 8));

		DiseasesDTO disease71 = new DiseasesDTO(135.0, 75.0, 205.0, 23.0, 105.0, 46.0, 165.0, 420, 1, 16.5,
				LocalDate.of(1992, 11, 15));
		DiseasesDTO disease72 = new DiseasesDTO(118.0, 94.0, 538.0, 34.0, 838.0, 66.0, 188.0, 660, 7, 4.8,
				LocalDate.of(1989, 3, 5));
		DiseasesDTO disease73 = new DiseasesDTO(122.0, 73.0, 712.0, 27.8, 712.0, 52.0, 174.0, 403, 3, 4.3,
				LocalDate.of(1993, 6, 22));
		DiseasesDTO disease74 = new DiseasesDTO(350.0, 82.0, 820.0, 28.7, 520.0, 56.0, 176.0, 570, 4, 0.6,
				LocalDate.of(1984, 2, 12));
		DiseasesDTO disease75 = new DiseasesDTO(178.0, 82.0, 928.0, 29.0, 328.0, 60.0, 182.0, 510, 5, 8.1,
				LocalDate.of(1997, 9, 8));
		DiseasesDTO disease76 = new DiseasesDTO(194.0, 77.0, 214.0, 26.3, 214.0, 54.0, 172.0, 390, 3, 4.1,
				LocalDate.of(1981, 3, 30));
		DiseasesDTO disease77 = new DiseasesDTO(126.0, 47.4, 426.0, 8.2, 156.0, 58.0, 180.0, 570, 5, 3.04,
				LocalDate.of(1996, 2, 18));
		DiseasesDTO disease78 = new DiseasesDTO(417.0, 77.4, 607.0, 85.0, 307.0, 48.0, 166.0, 920, 2, 1.5,
				LocalDate.of(2002, 1, 10));
		DiseasesDTO disease79 = new DiseasesDTO(744.0, 93.4, 434.0, 90.5, 534.0, 62.0, 184.0, 210, 6, 3.3,
				LocalDate.of(1978, 3, 2));
		DiseasesDTO disease80 = new DiseasesDTO(926.0, 83.3, 116.0, 17.2, 416.0, 54.0, 174.0, 400, 4, 2.5,
				LocalDate.of(1994, 7, 25));

		DiseasesDTO disease81 = new DiseasesDTO(420.0, 85.0, 120.0, 77.5, 110.0, 55.1, 175.3, 70, 4, 23.5,
				LocalDate.of(2000, 1, 1));
		DiseasesDTO disease82 = new DiseasesDTO(540.0, 90.9, 130.3, 78.0, 140.0, 60.2, 180.5, 240, 8, 33.0,
				LocalDate.of(1985, 3, 15));
		DiseasesDTO disease83 = new DiseasesDTO(620.0, 80.6, 110.5, 56.0, 150.0, 50.3, 170.4, 430, 2, 22.0,
				LocalDate.of(1995, 7, 22));
		DiseasesDTO disease84 = new DiseasesDTO(725.0, 82.1, 115.0, 56.5, 185.0, 52.1, 172.2, 980, 5, 21.2,
				LocalDate.of(1980, 2, 10));
		DiseasesDTO disease85 = new DiseasesDTO(135.0, 88.0, 125.7, 28.5, 195.0, 58.9, 178.1, 850, 2, 12.8,
				LocalDate.of(1998, 7, 5));
		DiseasesDTO disease86 = new DiseasesDTO(228.0, 84.2, 118.3, 27.0, 128.0, 54.3, 176.3, 620, 5, 21.71,
				LocalDate.of(1982, 9, 12));
		DiseasesDTO disease87 = new DiseasesDTO(332.0, 86.9, 122.2, 88.8, 112.0, 56.2, 178.5, 576, 9, 2.16,
				LocalDate.of(1990, 4, 30));
		DiseasesDTO disease88 = new DiseasesDTO(545.0, 92.6, 135.5, 70.0, 125.0, 62.8, 185.8, 634, 1, 31.5,
				LocalDate.of(1975, 9, 18));
		DiseasesDTO disease89 = new DiseasesDTO(618.0, 78.6, 108.0, 55.5, 138.0, 48.7, 168.2, 430, 2, 11.8,
				LocalDate.of(2005, 1, 25));
		DiseasesDTO disease90 = new DiseasesDTO(242.0, 91.3, 132.2, 49.5, 142.0, 64.6, 182.4, 523, 12, 13.2,
				LocalDate.of(1987, 6, 8));

		DiseasesDTO disease91 = new DiseasesDTO(215.0, 76.2, 105.2, 74.0, 105.0, 46.0, 165.0, 400, 1, 1.5,
				LocalDate.of(1992, 10, 12));
		DiseasesDTO disease92 = new DiseasesDTO(548.0, 94.0, 138.4, 51.0, 138.0, 66.0, 188.0, 640, 7, 3.8,
				LocalDate.of(1989, 8, 5));
		DiseasesDTO disease93 = new DiseasesDTO(722.0, 79.9, 112.7, 46.8, 112.0, 52.0, 174.0, 470, 3, 2.3,
				LocalDate.of(1993, 3, 22));
		DiseasesDTO disease94 = new DiseasesDTO(930.0, 84.8, 120.3, 87.7, 120.0, 56.0, 176.0, 510, 4, 2.6,
				LocalDate.of(1984, 12, 12));
		DiseasesDTO disease95 = new DiseasesDTO(138.0, 89.5, 128.6, 59.0, 128.0, 60.0, 182.0, 580, 5, 3.1,
				LocalDate.of(1997, 7, 2));
		DiseasesDTO disease96 = new DiseasesDTO(224.0, 81.3, 114.8, 26.3, 114.0, 54.0, 172.0, 490, 3, 2.1,
				LocalDate.of(1981, 5, 20));
		DiseasesDTO disease97 = new DiseasesDTO(536.0, 87.3, 126.9, 28.5, 126.0, 58.0, 180.0, 560, 5, 3.0,
				LocalDate.of(1996, 2, 18));
		DiseasesDTO disease98 = new DiseasesDTO(717.0, 77.6, 107.0, 25.5, 107.0, 48.0, 166.0, 420, 2, 1.7,
				LocalDate.of(2002, 11, 1));
		DiseasesDTO disease99 = new DiseasesDTO(944.0, 93.00, 134.1, 30.45, 134.0, 62.0, 184.0, 610, 6, 3.4,
				LocalDate.of(1978, 4, 12));
		DiseasesDTO disease100 = new DiseasesDTO(726.0, 85.0, 116.2, 23.2, 116.0, 54.0, 174.0, 500, 4, 2.4,
				LocalDate.of(1994, 9, 20));

		DiseasesDTO disease101 = new DiseasesDTO(120.0, 85.08, 130.0, 87.5, 120.0, 55.0, 175.0, 510, 4, 2.5,
				LocalDate.of(2000, 1, 1));
		DiseasesDTO disease102 = new DiseasesDTO(110.0, 90.7, 132.0, 26.0, 130.0, 60.0, 180.0, 602, 5, 2.0,
				LocalDate.of(1925, 5, 15));
		DiseasesDTO disease103 = new DiseasesDTO(220.0, 80.5, 112.0, 24.0, 110.0, 50.0, 170.0, 458, 3, 2.0,
				LocalDate.of(1935, 8, 22));
		DiseasesDTO disease104 = new DiseasesDTO(475.0, 82.3, 113.0, 22.5, 115.0, 52.0, 172.0, 487, 5, 9.2,
				LocalDate.of(1960, 3, 10));
		DiseasesDTO disease105 = new DiseasesDTO(125.0, 88.2, 122.0, 21.5, 125.0, 58.0, 178.0, 554, 8, 8.8,
				LocalDate.of(1988, 11, 5));
		DiseasesDTO disease106 = new DiseasesDTO(328.0, 84.0, 111.0, 22.0, 118.0, 54.0, 176.0, 523, 1, 6.7,
				LocalDate.of(1902, 7, 12));
		DiseasesDTO disease107 = new DiseasesDTO(672.0, 86.9, 123.0, 29.8, 122.0, 56.0, 178.0, 538, 2, 4.6,
				LocalDate.of(1920, 4, 30));
		DiseasesDTO disease108 = new DiseasesDTO(345.0, 92.8, 137.0, 36.0, 135.0, 62.0, 185.0, 627, 6, 1.5,
				LocalDate.of(1955, 9, 18));
		DiseasesDTO disease109 = new DiseasesDTO(618.0, 78.7, 109.0, 23.5, 108.0, 48.0, 168.0, 434, 5, 2.8,
				LocalDate.of(2085, 2, 25));
		DiseasesDTO disease110 = new DiseasesDTO(442.0, 91.5, 130.0, 22.5, 132.0, 64.0, 182.0, 593, 9, 9.2,
				LocalDate.of(1907, 6, 8));

		DiseasesDTO disease111 = new DiseasesDTO(415.0, 66.0, 105.0, 24.0, 105.0, 46.0, 16.0, 400, 1, 1.5,
				LocalDate.of(1992, 10, 15));
		DiseasesDTO disease112 = new DiseasesDTO(548.0, 24.0, 138.0, 31.0, 138.0, 66.0, 188.0, 640, 7, 3.8,
				LocalDate.of(1989, 8, 12));
		DiseasesDTO disease113 = new DiseasesDTO(822.0, 79.0, 112.0, 26.8, 112.0, 52.0, 14.0, 470, 3, 2.3,
				LocalDate.of(1993, 3, 20));
		DiseasesDTO disease114 = new DiseasesDTO(230.0, 74.0, 120.0, 27.7, 120.0, 56.0, 76.0, 510, 4, 2.6,
				LocalDate.of(1984, 12, 22));
		DiseasesDTO disease115 = new DiseasesDTO(438.0, 59.0, 128.0, 29.0, 128.0, 60.0, 122.0, 580, 5, 3.1,
				LocalDate.of(1997, 7, 23));
		DiseasesDTO disease116 = new DiseasesDTO(724.0, 31.0, 114.0, 26.3, 114.0, 54.0, 12.0, 490, 3, 2.1,
				LocalDate.of(1981, 5, 11));
		DiseasesDTO disease117 = new DiseasesDTO(836.0, 77.0, 126.0, 28.2, 126.0, 58.0, 120.0, 560, 5, 3.0,
				LocalDate.of(1996, 2, 28));
		DiseasesDTO disease118 = new DiseasesDTO(317.0, 57.0, 107.0, 25.0, 107.0, 48.0, 116.0, 420, 2, 1.7,
				LocalDate.of(2002, 11, 11));
		DiseasesDTO disease119 = new DiseasesDTO(644.0, 23.0, 134.0, 30.5, 134.0, 62.0, 185.0, 610, 6, 3.4,
				LocalDate.of(1978, 4, 12));
		DiseasesDTO disease120 = new DiseasesDTO(826.0, 8.0, 116.0, 27.2, 116.0, 54.0, 174.0, 500, 4, 2.4,
				LocalDate.of(1994, 9, 15));

		DiseasesDTO disease121 = new DiseasesDTO(151.0, 82.0, 123.0, 27.5, 122.0, 25.0, 275.0, 500, 4, 6.5,
				LocalDate.of(2021, 1, 1));
		DiseasesDTO disease122 = new DiseasesDTO(121.0, 92.0, 130.0, 28.2, 133.0, 60.0, 280.0, 600, 5, 3.0,
				LocalDate.of(1922, 5, 15));
		DiseasesDTO disease123 = new DiseasesDTO(151.0, 82.0, 114.0, 26.0, 116.0, 20.0, 270.0, 450, 3, 3.0,
				LocalDate.of(1929, 8, 22));
		DiseasesDTO disease124 = new DiseasesDTO(191.0, 82.0, 115.0, 26.8, 118.0, 22.0, 272.0, 480, 3, 5.2,
				LocalDate.of(1924, 3, 10));
		DiseasesDTO disease125 = new DiseasesDTO(101.0, 88.0, 125.0, 28.7, 128.0, 28.0, 278.0, 550, 4, 8.8,
				LocalDate.of(1924, 11, 5));
		DiseasesDTO disease126 = new DiseasesDTO(121.0, 82.0, 115.0, 27.2, 112.0, 24.0, 276.0, 520, 4, 2.7,
				LocalDate.of(1926, 7, 12));
		DiseasesDTO disease127 = new DiseasesDTO(141.0, 82.0, 122.0, 28.7, 121.0, 26.0, 278.0, 530, 4, 5.6,
				LocalDate.of(1927, 4, 30));
		DiseasesDTO disease128 = new DiseasesDTO(171.0, 92.0, 136.0, 30.5, 135.0, 22.0, 285.0, 620, 6, 2.5,
				LocalDate.of(1923, 9, 18));
		DiseasesDTO disease129 = new DiseasesDTO(121.0, 72.0, 108.0, 25.32, 108.10, 28.0, 168.0, 430, 21, 1.8,
				LocalDate.of(2015, 2, 25));
		DiseasesDTO disease130 = new DiseasesDTO(121.0, 92.0, 137.0, 29.3, 122.0, 24.0, 282.0, 590, 5, 7.2,
				LocalDate.of(1927, 6, 8));

		DiseasesDTO disease131 = new DiseasesDTO(113.0, 76.31, 102.0, 24.0, 125.0, 46.1, 162.0, 410, 1, 1.2,
				LocalDate.of(1941, 10, 15));
		DiseasesDTO disease132 = new DiseasesDTO(143.0, 94.63, 132.0, 11.0, 138.0, 66.0, 183.0, 690, 5, 9.2,
				LocalDate.of(1951, 8, 5));
		DiseasesDTO disease133 = new DiseasesDTO(123.0, 79.45, 112.0, 96.8, 162.0, 52.9, 174.0, 480, 6, 8.2,
				LocalDate.of(1971, 3, 22));
		DiseasesDTO disease134 = new DiseasesDTO(133.0, 84.37, 122.0, 97.7, 180.0, 56.8, 175.0, 560, 2, 6.2,
				LocalDate.of(1981, 12, 12));
		DiseasesDTO disease135 = new DiseasesDTO(135.0, 89.99, 122.0, 89.0, 198.0, 60.6, 186.0, 550, 5, 1.2,
				LocalDate.of(1991, 7, 8));
		DiseasesDTO disease136 = new DiseasesDTO(126.0, 81.83, 112.0, 76.3, 134.0, 54.5, 177.0, 430, 6, 2.2,
				LocalDate.of(1901, 5, 30));
		DiseasesDTO disease137 = new DiseasesDTO(137.0, 87.62, 1620, 68.2, 126.0, 58.3, 188.0, 550, 7, 5.2,
				LocalDate.of(1992, 2, 18));
		DiseasesDTO disease138 = new DiseasesDTO(118.0, 77.55, 107.0, 55.0, 157.0, 46.2, 169.0, 440, 7, 5.2,
				LocalDate.of(2021, 11, 10));
		DiseasesDTO disease139 = new DiseasesDTO(14.0, 93.08, 154.0, 40.5, 144.0, 65.0, 180.0, 620, 6, 4.2,
				LocalDate.of(1973, 4, 2));
		DiseasesDTO disease140 = new DiseasesDTO(196.0, 83.33, 156.0, 37.2, 126.0, 52.0, 172.0, 200, 4, 2.3,
				LocalDate.of(1943, 9, 25));

		DiseasesDTO disease141 = new DiseasesDTO(630.0, 85.02, 440.0, 27.5, 120.3, 55.5, 175.8, 530, 4, 2.25,
				LocalDate.of(2020, 1, 1));
		DiseasesDTO disease142 = new DiseasesDTO(240.0, 60.4, 335.0, 28.0, 130.8, 60.3, 180.3, 660, 5, 3.02,
				LocalDate.of(1849, 5, 15));
		DiseasesDTO disease143 = new DiseasesDTO(420.0, 60.02, 370.0, 26.0, 110.6, 50.5, 170.3, 400, 3, 2.03,
				LocalDate.of(1455, 8, 22));
		DiseasesDTO disease144 = new DiseasesDTO(625.0, 62.3, 419.0, 26.5, 115.3, 52.7, 172.8, 490, 3, 2.82,
				LocalDate.of(1930, 3, 10));
		DiseasesDTO disease145 = new DiseasesDTO(366.0, 58.3, 334.0, 28.5, 125.0, 58.8, 178.7, 580, 4, 27.8,
				LocalDate.of(1868, 11, 5));
		DiseasesDTO disease146 = new DiseasesDTO(768.0, 44.7, 33.0, 27.0, 118.9, 54.0, 176.6, 550, 4, 4.7,
				LocalDate.of(1932, 7, 12));
		DiseasesDTO disease147 = new DiseasesDTO(332.0, 86.5, 422.0, 28.8, 122.6, 56.6, 178.4, 540, 4, 1.6,
				LocalDate.of(1926, 4, 30));
		DiseasesDTO disease148 = new DiseasesDTO(145.0, 32.0, 835.0, 30.0, 135.2, 62.4, 185.3, 620, 6, 5.5,
				LocalDate.of(1943, 9, 18));
		DiseasesDTO disease149 = new DiseasesDTO(348.0, 38.3, 188.0, 25.5, 108.3, 48.3, 168.2, 430, 2, 4.8,
				LocalDate.of(2021, 2, 25));
		DiseasesDTO disease150 = new DiseasesDTO(394.0, 31.2, 892.0, 29.5, 132.3, 64.3, 182.2, 530, 5, 3.2,
				LocalDate.of(1926, 6, 8));

		DiseasesDTO disease151 = new DiseasesDTO(155.0, 70.0, 205.5, 3.0, 105.05, 46.50, 165.50, 426, 1, 16.5,
				LocalDate.of(1942, 11, 15));
		DiseasesDTO disease152 = new DiseasesDTO(158.0, 95.0, 538.5, 4.0, 838.05, 66.05, 188.04, 650, 7, 4.8,
				LocalDate.of(1949, 3, 5));
		DiseasesDTO disease153 = new DiseasesDTO(152.0, 75.0, 712.5, 27.8, 712.05, 52.50, 174.03, 203, 3, 4.3,
				LocalDate.of(1893, 6, 22));
		DiseasesDTO disease154 = new DiseasesDTO(350.0, 85.0, 820.05, 8.7, 520.05, 56.0, 176.06, 560, 4, 0.6,
				LocalDate.of(1934, 2, 12));
		DiseasesDTO disease155 = new DiseasesDTO(158.0, 85.0, 928.5, 9.0, 328.05, 60.5, 182.03, 550, 5, 8.1,
				LocalDate.of(1967, 9, 8));
		DiseasesDTO disease156 = new DiseasesDTO(154.0, 75.0, 214.5, 6.3, 214.05, 54.5, 172.02, 320, 3, 4.1,
				LocalDate.of(1981, 3, 30));
		DiseasesDTO disease157 = new DiseasesDTO(156.0, 45.4, 426.5, 8.2, 156.05, 58.05, 180.06, 70, 5, 3.04,
				LocalDate.of(1996, 2, 18));
		DiseasesDTO disease158 = new DiseasesDTO(457.0, 75.4, 607.5, 8.0, 307.05, 48.0, 166.08, 92, 2, 1.5,
				LocalDate.of(20022, 1, 10));
		DiseasesDTO disease159 = new DiseasesDTO(754.0, 95.4, 434.55, 50.5, 534.50, 65.0, 184.80, 110, 6, 3.3,
				LocalDate.of(1928, 3, 2));
		DiseasesDTO disease160 = new DiseasesDTO(956.0, 85.3, 116.5, 15.2, 416.05, 55.0, 174.07, 440, 4, 2.5,
				LocalDate.of(1992, 7, 25));

		DiseasesDTO disease161 = new DiseasesDTO(170.0, 85.0, 120.0, 72.5, 140.0, 53.1, 235.3, 70, 4, 23.5,
				LocalDate.of(2000, 2, 1));
		DiseasesDTO disease162 = new DiseasesDTO(5170.0, 70.9, 137.3, 88.0, 140.0, 60.5, 380.5, 240, 6, 33.0,
				LocalDate.of(1985, 7, 15));
		DiseasesDTO disease163 = new DiseasesDTO(617.0, 80.6, 110.5, 56.0, 153.0, 50.4, 230.4, 430, 2, 22.6,
				LocalDate.of(1995, 4, 22));
		DiseasesDTO disease164 = new DiseasesDTO(175.0, 87.1, 115.70, 46.5, 185.0, 52.2, 172.2, 980, 7, 51.2,
				LocalDate.of(1980, 12, 10));
		DiseasesDTO disease165 = new DiseasesDTO(115.0, 87.0, 125.4, 28.3, 132.0, 58.57, 578.1, 850, 5, 42.8,
				LocalDate.of(1998, 4, 5));
		DiseasesDTO disease166 = new DiseasesDTO(178.0, 84.2, 118.37, 27.0, 548.0, 54.33, 176.3, 620, 5, 31.71,
				LocalDate.of(1982, 7, 12));
		DiseasesDTO disease167 = new DiseasesDTO(172.0, 87.9, 122.2, 88.3, 156.0, 56.5, 178.5, 576, 5, 2.76,
				LocalDate.of(1990, 8, 30));
		DiseasesDTO disease168 = new DiseasesDTO(175.0, 97.6, 135.5, 70.3, 178.0, 62.3, 345.8, 634, 4, 71.5,
				LocalDate.of(1975, 6, 18));
		DiseasesDTO disease169 = new DiseasesDTO(178.0, 77.6, 107.0, 55.5, 123.0, 48.4, 148.2, 430, 4, 81.8,
				LocalDate.of(2005, 2, 25));
		DiseasesDTO disease170 = new DiseasesDTO(172.0, 71.3, 152.2, 49.5, 342.0, 64.4, 122.4, 523, 2, 33.2,
				LocalDate.of(1987, 3, 8));

		DiseasesDTO disease171 = new DiseasesDTO(815.0, 73.2, 103.2, 72.0, 102.0, 42.0, 162.0, 402, 1, 1.5,
				LocalDate.of(1994, 10, 12));
		DiseasesDTO disease172 = new DiseasesDTO(748.0, 94.0, 132.4, 53.0, 138.2, 62.0, 182.0, 642, 7, 3.8,
				LocalDate.of(1985, 8, 5));
		DiseasesDTO disease173 = new DiseasesDTO(622.0, 76.9, 112.4, 46.8, 112.2, 52.0, 174.0, 472, 3, 2.3,
				LocalDate.of(1993, 3, 22));
		DiseasesDTO disease174 = new DiseasesDTO(530.0, 87.8, 120.3, 85.7, 120.2, 52.0, 173.0, 512, 4, 2.6,
				LocalDate.of(1984, 12, 12));
		DiseasesDTO disease175 = new DiseasesDTO(538.0, 85.5, 126.6, 59.0, 128.0, 62.0, 183.0, 582, 5, 3.1,
				LocalDate.of(1997, 7, 2));
		DiseasesDTO disease176 = new DiseasesDTO(254.0, 83.3, 114.8, 26.6, 113.0, 52.0, 175.0, 492, 3, 2.1,
				LocalDate.of(1998, 5, 20));
		DiseasesDTO disease177 = new DiseasesDTO(436.0, 82.3, 125.9, 28.5, 126.0, 52.0, 185.0, 562, 5, 3.0,
				LocalDate.of(1993, 2, 18));
		DiseasesDTO disease178 = new DiseasesDTO(217.0, 74.6, 107.0, 25.7, 103.0, 42.0, 165.0, 422, 2, 1.7,
				LocalDate.of(20012, 11, 1));
		DiseasesDTO disease179 = new DiseasesDTO(244.0, 97.00, 134.1, 30.45, 334.0, 22.0, 484.0, 210, 6, 3.4,
				LocalDate.of(1988, 4, 12));
		DiseasesDTO disease180 = new DiseasesDTO(226.0, 87.0, 116.2, 24.2, 113.0, 54.2, 134.0, 502, 4, 2.4,
				LocalDate.of(1984, 9, 20));

		DiseasesDTO disease181 = new DiseasesDTO(120.2, 85.78, 430.0, 77.5, 220.0, 55.5, 175.50, 510, 4, 12.5,
				LocalDate.of(2000, 1, 1));
		DiseasesDTO disease182 = new DiseasesDTO(110.3, 90.3, 142.0, 27.0, 120.0, 60.5, 180.05, 602, 5, 12.0,
				LocalDate.of(1925, 5, 15));
		DiseasesDTO disease183 = new DiseasesDTO(220.5, 80.2, 162.0, 64.0, 120.0, 50.0, 170.05, 458, 3, 12.0,
				LocalDate.of(1935, 8, 22));
		DiseasesDTO disease184 = new DiseasesDTO(475.7, 82.4, 183.0, 52.5, 15.0, 52.5, 172.03, 487, 5, 19.2,
				LocalDate.of(1960, 3, 10));
		DiseasesDTO disease185 = new DiseasesDTO(125.8, 88.9, 192.0, 41.5, 225.0, 58.0, 178.02, 554, 8, 18.8,
				LocalDate.of(1988, 11, 5));
		DiseasesDTO disease186 = new DiseasesDTO(328.0, 84.8, 311.0, 22.0, 218.0, 54.5, 176.03, 523, 1, 16.7,
				LocalDate.of(1902, 7, 12));
		DiseasesDTO disease187 = new DiseasesDTO(672.2, 86.6, 323.0, 29.2, 222.0, 56.5, 178.0, 538, 2, 14.6,
				LocalDate.of(1920, 4, 30));
		DiseasesDTO disease188 = new DiseasesDTO(345.1, 92.4, 637.0, 36.2, 235.0, 62.0, 185.05, 627, 6, 11.5,
				LocalDate.of(1955, 9, 18));
		DiseasesDTO disease189 = new DiseasesDTO(618.5, 78.3, 709.0, 23.2, 208.0, 48.4, 168.0, 434, 5, 12.8,
				LocalDate.of(2085, 2, 25));
		DiseasesDTO disease190 = new DiseasesDTO(442.7, 91.2, 930.0, 22.2, 232.0, 64.3, 182.03, 593, 9, 19.2,
				LocalDate.of(1907, 6, 8));

		DiseasesDTO disease191 = new DiseasesDTO(412.0, 66.5, 145.0, 24.8, 102.0, 46.0, 13.0, 430, 1, 1.3,
				LocalDate.of(1992, 10, 25));
		DiseasesDTO disease192 = new DiseasesDTO(528.0, 24.2, 168.0, 31.8, 132.0, 46.0, 138.0, 340, 7, 3.2,
				LocalDate.of(1989, 8, 22));
		DiseasesDTO disease193 = new DiseasesDTO(842.0, 79.3, 172.0, 26.8, 113.0, 92.0, 13.0, 430, 3, 2.2,
				LocalDate.of(1993, 3, 22));
		DiseasesDTO disease194 = new DiseasesDTO(260.0, 74.8, 180.0, 27.7, 124.0, 96.0, 73.0, 530, 4, 2.6,
				LocalDate.of(1984, 12, 12));
		DiseasesDTO disease195 = new DiseasesDTO(638.0, 59.7, 188.0, 29.7, 125.0, 90.0, 132.0, 380, 5, 4.1,
				LocalDate.of(1997, 7, 13));
		DiseasesDTO disease196 = new DiseasesDTO(764.0, 31.6, 144.0, 26.6, 116.0, 84.0, 13.0, 430, 3, 2.4,
				LocalDate.of(1961, 5, 16));
		DiseasesDTO disease197 = new DiseasesDTO(866.0, 77.4, 156.0, 28.6, 127.0, 88.0, 130.0, 360, 5, 3.40,
				LocalDate.of(1936, 2, 28));
		DiseasesDTO disease198 = new DiseasesDTO(367.0, 57.3, 177.0, 25.6, 108.0, 78.0, 136.0, 320, 2, 1.74,
				LocalDate.of(2022, 11, 11));
		DiseasesDTO disease199 = new DiseasesDTO(664.0, 23.3, 174.0, 30.5, 138.0, 62.0, 135.0, 310, 6, 3.44,
				LocalDate.of(1948, 4, 12));
		DiseasesDTO disease200 = new DiseasesDTO(866.0, 8.6, 118.0, 27.3, 118.0, 55.0, 173.0, 530, 4, 2.44,
				LocalDate.of(1954, 9, 15));

		DiseasesDTO disease201 = new DiseasesDTO(422.0, 55.0, 520.0, 73.5, 310.0, 85.1, 145.3, 60, 4, 23.3,
				LocalDate.of(2005, 1, 1));
		DiseasesDTO disease202 = new DiseasesDTO(542.0, 30.9, 530.3, 73.0, 340.0, 60.2, 150.5, 540, 8, 33.3,
				LocalDate.of(1955, 3, 15));
		DiseasesDTO disease203 = new DiseasesDTO(622.0, 20.6, 410.5, 53.0, 450.0, 55.3, 160.4, 330, 2, 22.3,
				LocalDate.of(1955, 7, 22));
		DiseasesDTO disease204 = new DiseasesDTO(722.0, 42.1, 515.0, 56.3, 685.0, 54.1, 182.2, 380, 5, 21.4,
				LocalDate.of(1950, 2, 10));
		DiseasesDTO disease205 = new DiseasesDTO(135.0, 68.0, 325.7, 28.3, 695.0, 53.9, 148.1, 870, 2, 12.7,
				LocalDate.of(1958, 7, 5));
		DiseasesDTO disease206 = new DiseasesDTO(228.2, 54.2, 218.3, 27.3, 728.0, 55.3, 126.3, 660, 5, 21.1,
				LocalDate.of(1952, 9, 12));
		DiseasesDTO disease207 = new DiseasesDTO(332.2, 46.9, 322.2, 88.3, 712.0, 54.2, 128.5, 566, 9, 22.6,
				LocalDate.of(1950, 4, 30));
		DiseasesDTO disease208 = new DiseasesDTO(545.3, 42.6, 435.5, 70.3, 825.0, 63.8, 145.8, 664, 1, 31.5,
				LocalDate.of(1955, 9, 18));
		DiseasesDTO disease209 = new DiseasesDTO(618.5, 72.6, 608.0, 55.3, 338.0, 48.3, 158.2, 434, 2, 11.8,
				LocalDate.of(2009, 1, 25));
		DiseasesDTO disease210 = new DiseasesDTO(242.07, 41.3, 332.2, 49.3, 342.0, 64.4, 782.4, 523, 12, 13.2,
				LocalDate.of(1997, 6, 8));

		DiseasesDTO disease211 = new DiseasesDTO(225.0, 76.3, 305.2, 72.0, 125.0, 46.3, 365.0, 403, 1, 11.5,
				LocalDate.of(1952, 10, 12));
		DiseasesDTO disease212 = new DiseasesDTO(528.0, 94.2, 238.4, 52.0, 128.0, 63.0, 288.0, 643, 7, 13.8,
				LocalDate.of(1959, 2, 5));
		DiseasesDTO disease213 = new DiseasesDTO(722.0, 79.2, 212.7, 42.8, 122.0, 53.0, 374.0, 473, 3, 12.3,
				LocalDate.of(1953, 2, 22));
		DiseasesDTO disease214 = new DiseasesDTO(920.0, 84.2, 220.3, 82.7, 130.0, 53.0, 476.0, 513, 4, 12.6,
				LocalDate.of(1954, 12, 12));
		DiseasesDTO disease215 = new DiseasesDTO(128.0, 89.2, 128.6, 52.0, 148.0, 60.3, 232.0, 583, 5, 13.1,
				LocalDate.of(1957, 2, 2));
		DiseasesDTO disease216 = new DiseasesDTO(224.0, 81.3, 124.8, 22.3, 144.0, 54.2, 132.0, 493, 3, 12.1,
				LocalDate.of(1951, 2, 20));
		DiseasesDTO disease217 = new DiseasesDTO(526.0, 27.3, 136.9, 22.5, 126.0, 58.2, 130.0, 563, 5, 13.0,
				LocalDate.of(1995, 3, 18));
		DiseasesDTO disease218 = new DiseasesDTO(727.0, 27.6, 107.3, 22.5, 157.0, 48.2, 136.0, 423, 2, 11.7,
				LocalDate.of(2005, 11, 1));
		DiseasesDTO disease219 = new DiseasesDTO(924.0, 23.00, 134.1, 20.45, 634.0, 62.20, 184.0, 310, 16, 3.4,
				LocalDate.of(1958, 5, 12));
		DiseasesDTO disease220 = new DiseasesDTO(726.0, 25.0, 116.23, 33.2, 166.0, 54.2, 174.0, 500, 4, 12.4,
				LocalDate.of(1995, 9, 10));

		DiseasesDTO disease221 = new DiseasesDTO(320.0, 81.08, 130.3, 37.5, 130.0, 55.3, 175.7, 510, 4, 2.5,
				LocalDate.of(2007, 5, 1));
		DiseasesDTO disease222 = new DiseasesDTO(310.0, 91.7, 132.5, 22.0, 133.0, 60.3, 180.5, 602, 4, 2.0,
				LocalDate.of(1927, 3, 15));
		DiseasesDTO disease223 = new DiseasesDTO(320.0, 81.5, 112.4, 34.0, 113.0, 50.3, 170.3, 458, 6, 2.0,
				LocalDate.of(1937, 5, 22));
		DiseasesDTO disease224 = new DiseasesDTO(375.0, 81.3, 113.3, 32.5, 113.0, 52.4, 172.3, 487, 7, 9.2,
				LocalDate.of(1967, 7, 10));
		DiseasesDTO disease225 = new DiseasesDTO(325.0, 81.2, 122.3, 31.5, 123.0, 58.5, 178.8, 554, 7, 8.8,
				LocalDate.of(1986, 11, 5));
		DiseasesDTO disease226 = new DiseasesDTO(328.0, 81.0, 111.1, 32.0, 113.0, 54.6, 176.7, 523, 3, 6.7,
				LocalDate.of(1905, 3, 12));
		DiseasesDTO disease227 = new DiseasesDTO(372.0, 81.9, 123.2, 39.8, 123.0, 56.7, 178.7, 538, 5, 4.6,
				LocalDate.of(1926, 5, 30));
		DiseasesDTO disease228 = new DiseasesDTO(445.0, 91.8, 137.1, 36.3, 133.0, 62.8, 185.6, 627, 3, 1.5,
				LocalDate.of(1956, 6, 18));
		DiseasesDTO disease229 = new DiseasesDTO(648.0, 71.7, 109.2, 23.4, 103.0, 48.8, 168.5, 434, 5, 2.8,
				LocalDate.of(2087, 3, 25));
		DiseasesDTO disease230 = new DiseasesDTO(442.0, 92.5, 130.2, 22.3, 133.0, 64.2, 182.4, 593, 2, 9.2,
				LocalDate.of(1977, 5, 8));

		DiseasesDTO disease231 = new DiseasesDTO(445.0, 66.6, 105.3, 22.0, 105.2, 46.3, 16.3, 400, 1, 1.5,
				LocalDate.of(1992, 10, 25));
		DiseasesDTO disease232 = new DiseasesDTO(548.0, 24.06, 138.3, 21.0, 138.2, 66.8, 188.03, 640, 7, 3.8,
				LocalDate.of(1989, 8, 22));
		DiseasesDTO disease233 = new DiseasesDTO(842.0, 79.5, 112.0, 22.8, 112.2, 52.8, 14.0, 473, 3, 2.3,
				LocalDate.of(1993, 3, 22));
		DiseasesDTO disease234 = new DiseasesDTO(240.0, 74.0, 120.3, 23.7, 120.2, 56.7, 76.0, 513, 4, 2.6,
				LocalDate.of(1984, 12, 22));
		DiseasesDTO disease235 = new DiseasesDTO(448.0, 59.4, 128.4, 28.0, 128.4, 60.7, 122.0, 530, 5, 3.1,
				LocalDate.of(1997, 7, 23));
		DiseasesDTO disease236 = new DiseasesDTO(744.0, 31.3, 114.5, 27.3, 114.6, 54.5, 12.0, 493, 3, 2.1,
				LocalDate.of(1981, 5, 12));
		DiseasesDTO disease237 = new DiseasesDTO(86.0, 77.2, 126.07, 25.2, 126.7, 58.4, 120.0, 540, 5, 3.0,
				LocalDate.of(1996, 2, 22));
		DiseasesDTO disease238 = new DiseasesDTO(317.0, 57.2, 107.7, 24.0, 107.7, 48.3, 116.0, 450, 2, 1.7,
				LocalDate.of(2002, 11, 21));
		DiseasesDTO disease239 = new DiseasesDTO(444.0, 23.2, 134.7, 33.5, 134.8, 62.2, 185.0, 660, 6, 3.4,
				LocalDate.of(1978, 4, 22));
		DiseasesDTO disease240 = new DiseasesDTO(426.0, 8.2, 116.02, 23.2, 116.8, 54.2, 174.0, 570, 4, 2.4,
				LocalDate.of(1994, 9, 25));

		DiseasesDTO disease241 = new DiseasesDTO(251.2, 82.4, 123.0, 22.5, 222.0, 25.5, 275.2, 500, 4, 16.5,
				LocalDate.of(2022, 1, 1));
		DiseasesDTO disease242 = new DiseasesDTO(121.2, 92.3, 130.0, 24.2, 333.0, 60.5, 280.1, 600, 5, 13.0,
				LocalDate.of(1923, 5, 15));
		DiseasesDTO disease243 = new DiseasesDTO(151.4, 82.2, 154.0, 24.0, 516.0, 20.3, 270.2, 450, 3, 13.0,
				LocalDate.of(1923, 8, 22));
		DiseasesDTO disease244 = new DiseasesDTO(191.5, 82.2, 165.0, 22.8, 318.0, 22.3, 272.4, 480, 3, 15.2,
				LocalDate.of(1924, 3, 10));
		DiseasesDTO disease245 = new DiseasesDTO(101.7, 88.2, 135.0, 22.7, 228.0, 28.6, 278.6, 550, 4, 18.8,
				LocalDate.of(1925, 11, 5));
		DiseasesDTO disease246 = new DiseasesDTO(121.8, 82.6, 125.0, 24.2, 312.0, 24.6, 276.3, 520, 4, 12.7,
				LocalDate.of(1925, 7, 12));
		DiseasesDTO disease247 = new DiseasesDTO(141.9, 82.5, 122.0, 24.7, 421.0, 26.5, 278.2, 530, 4, 15.6,
				LocalDate.of(1923, 4, 30));
		DiseasesDTO disease248 = new DiseasesDTO(171.1, 92.3, 146.0, 33.5, 335.0, 22.4, 285.3, 620, 6, 12.5,
				LocalDate.of(192, 9, 18));
		DiseasesDTO disease249 = new DiseasesDTO(121.5, 72.2, 168.0, 23.32, 408.10, 24.0, 168.0, 430, 211, 1.8,
				LocalDate.of(2022, 2, 25));
		DiseasesDTO disease250 = new DiseasesDTO(121.7, 92.3, 177.0, 22.3, 142.0, 24.4, 282.0, 590, 5, 17.2,
				LocalDate.of(1927, 2, 8));

		DiseasesDTO disease251 = new DiseasesDTO(132.5, 85.3, 120.0, 27.3, 120.3, 35.0, 175.3, 330, 3, 2.5,
				LocalDate.of(2002, 1, 1));
		DiseasesDTO disease252 = new DiseasesDTO(123.8, 90.3, 140.0, 28.3, 130.3, 40.0, 180.7, 630, 8, 3.0,
				LocalDate.of(1982, 5, 15));
		DiseasesDTO disease253 = new DiseasesDTO(124.7, 80.5, 140.0, 26.4, 110.5, 50.0, 170.5, 440, 7, 2.0,
				LocalDate.of(1992, 8, 22));
		DiseasesDTO disease254 = new DiseasesDTO(125.5, 82.5, 155.0, 26.5, 115.8, 32.0, 172.3, 430, 6, 2.2,
				LocalDate.of(1982, 3, 10));
		DiseasesDTO disease255 = new DiseasesDTO(137.3, 88.6, 145.0, 28.7, 125.7, 48.0, 178.5, 550, 4, 2.8,
				LocalDate.of(1992, 11, 5));
		DiseasesDTO disease256 = new DiseasesDTO(128.7, 84.4, 138.0, 27.7, 118.6, 54.0, 176.8, 530, 2, 2.7,
				LocalDate.of(1982, 7, 12));
		DiseasesDTO disease257 = new DiseasesDTO(132.6, 86.2, 162.0, 28.5, 122.4, 46.0, 178.7, 550, 4, 2.6,
				LocalDate.of(1992, 4, 30));
		DiseasesDTO disease258 = new DiseasesDTO(144.5, 92.4, 145.0, 30.3, 135.3, 42.0, 185.6, 660, 2, 3.5,
				LocalDate.of(1972, 9, 18));
		DiseasesDTO disease259 = new DiseasesDTO(112.4, 78.6, 158.0, 25.3, 108.3, 68.0, 168.5, 460, 5, 1.8,
				LocalDate.of(2002, 2, 25));
		DiseasesDTO disease260 = new DiseasesDTO(142.3, 91.7, 142.0, 29.5, 132.3, 74.0, 182.3, 530, 3, 3.2,
				LocalDate.of(1982, 6, 8));

		DiseasesDTO disease261 = new DiseasesDTO(415.0, 76.3, 105.5, 24.0, 105.0, 46.0, 165.3, 405, 4, 11.5,
				LocalDate.of(1992, 11, 15));
		DiseasesDTO disease262 = new DiseasesDTO(348.0, 94.4, 138.3, 31.0, 138.0, 66.0, 188.3, 644, 4, 13.8,
				LocalDate.of(1989, 3, 5));
		DiseasesDTO disease263 = new DiseasesDTO(322.0, 79.7, 112.3, 26.8, 112.0, 52.0, 174.3, 472, 5, 12.3,
				LocalDate.of(1993, 4, 22));
		DiseasesDTO disease264 = new DiseasesDTO(830.0, 84.8, 120.7, 27.7, 120.0, 56.0, 176.3, 514, 6, 12.6,
				LocalDate.of(1984, 12, 12));
		DiseasesDTO disease265 = new DiseasesDTO(738.0, 89.9, 128.9, 29.0, 128.0, 60.0, 182.3, 587, 8, 13.1,
				LocalDate.of(1997, 4, 8));
		DiseasesDTO disease266 = new DiseasesDTO(624.0, 81.3, 114.9, 26.3, 114.0, 54.0, 172.5, 496, 4, 12.1,
				LocalDate.of(1981, 5, 30));
		DiseasesDTO disease267 = new DiseasesDTO(436.0, 87.3, 126.8, 28.2, 126.0, 58.0, 180.6, 564, 2, 13.0,
				LocalDate.of(1996, 6, 18));
		DiseasesDTO disease268 = new DiseasesDTO(417.0, 77.7, 107.6, 25.0, 107.0, 48.0, 166.7, 423, 4, 11.7,
				LocalDate.of(2002, 6, 10));
		DiseasesDTO disease269 = new DiseasesDTO(44.0, 93.9, 134.4, 30.5, 134.0, 62.0, 184.3, 615, 6, 13.4,
				LocalDate.of(1978, 3, 2));
		DiseasesDTO disease270 = new DiseasesDTO(226.0, 83.0, 116.4, 27.2, 116.0, 54.0, 174.3, 503, 6, 12.4,
				LocalDate.of(1994, 4, 25));

		DiseasesDTO disease271 = new DiseasesDTO(331.0, 82.6, 133.0, 37.5, 122.2, 28.0, 275.3, 540, 4, 2.5,
				LocalDate.of(2008, 1, 1));
		DiseasesDTO disease272 = new DiseasesDTO(441.0, 92.4, 150.0, 68.2, 133.5, 67.0, 280.3, 630, 5, 3.4,
				LocalDate.of(1918, 5, 15));
		DiseasesDTO disease273 = new DiseasesDTO(521.0, 82.3, 174.0, 76.0, 116.5, 26.0, 270.4, 430, 3, 2.4,
				LocalDate.of(1988, 8, 22));
		DiseasesDTO disease274 = new DiseasesDTO(721.0, 82.8, 185.0, 66.8, 118.6, 24.0, 272.6, 470, 3, 2.5,
				LocalDate.of(1958, 3, 10));
		DiseasesDTO disease275 = new DiseasesDTO(331.0, 88.8, 195.0, 58.7, 128.7, 23.0, 278.7, 570, 4, 2.5,
				LocalDate.of(1947, 11, 5));
		DiseasesDTO disease276 = new DiseasesDTO(221.0, 82.6, 155.0, 37.2, 112.4, 25.0, 276.8, 560, 4, 2.2,
				LocalDate.of(1956, 7, 12));
		DiseasesDTO disease277 = new DiseasesDTO(331.0, 82.4, 132.0, 48.7, 121.2, 24.0, 278.8, 540, 4, 2.4,
				LocalDate.of(1976, 4, 30));
		DiseasesDTO disease278 = new DiseasesDTO(541.0, 92.6, 156.0, 70.5, 135.3, 23.0, 285.3, 640, 6, 3.3,
				LocalDate.of(1934, 9, 18));
		DiseasesDTO disease279 = new DiseasesDTO(11.0, 72.4, 106.0, 24.32, 108.10, 38.0, 168.2, 430, 2, 1.3,
				LocalDate.of(2005, 2, 25));
		DiseasesDTO disease280 = new DiseasesDTO(341.0, 92.3, 187.0, 24.3, 122.4, 24.0, 282.2, 593, 5, 3.3,
				LocalDate.of(1934, 6, 8));

		DiseasesDTO disease281 = new DiseasesDTO(113.05, 73.1, 102.04, 24.3, 125.03, 36.1, 162.3, 414, 1, 1.7,
				LocalDate.of(1991, 10, 25));
		DiseasesDTO disease282 = new DiseasesDTO(143.03, 93.6, 132.06, 11.3, 138.5, 46.0, 183.3, 694, 5, 3.7,
				LocalDate.of(1981, 8, 5));
		DiseasesDTO disease283 = new DiseasesDTO(123.04, 73.4, 112.05, 96.3, 162.4, 42.9, 174.4, 484, 6, 2.5,
				LocalDate.of(1991, 3, 22));
		DiseasesDTO disease284 = new DiseasesDTO(133.03, 83.3, 122.04, 97.3, 180.4, 36.8, 175.3, 563, 2, 2.5,
				LocalDate.of(1981, 12, 22));
		DiseasesDTO disease285 = new DiseasesDTO(135.03, 83.9, 122.04, 89.3, 198.5, 50.6, 186.5, 554, 5, 3.5,
				LocalDate.of(1991, 7, 28));
		DiseasesDTO disease286 = new DiseasesDTO(126.04, 83.8, 112.03, 76.3, 134.5, 54.5, 177.50, 435, 6, 2.5,
				LocalDate.of(1981, 5, 20));
		DiseasesDTO disease287 = new DiseasesDTO(137.04, 83.6, 162.30, 68.23, 126.5, 53.3, 188.5, 556, 7, 3.5,
				LocalDate.of(1991, 2, 12));
		DiseasesDTO disease288 = new DiseasesDTO(118.50, 73.5, 107.30, 55.03, 157.5, 36.2, 169.5, 446, 7, 1.5,
				LocalDate.of(2001, 11, 20));
		DiseasesDTO disease289 = new DiseasesDTO(14.3, 93.30, 154.3, 43.5, 144.5, 64.0, 180.5, 625, 6, 3.5,
				LocalDate.of(1978, 4, 22));
		DiseasesDTO disease290 = new DiseasesDTO(196.3, 33.3, 156.3, 47.2, 126.4, 52.0, 172.5, 250, 4, 2.3,
				LocalDate.of(1923, 9, 15));

		DiseasesDTO disease291 = new DiseasesDTO(330.3, 86.0, 480.0, 27.5, 120.7, 45.5, 135.8, 330, 7, 2.5,
				LocalDate.of(2023, 1, 1));
		DiseasesDTO disease292 = new DiseasesDTO(340.2, 65.0, 370.0, 68.0, 130.7, 30.3, 130.3, 360, 7, 3.4,
				LocalDate.of(1896, 5, 15));
		DiseasesDTO disease293 = new DiseasesDTO(320.4, 67.0, 360.0, 46.0, 110.7, 30.5, 130.3, 300, 8, 2.40,
				LocalDate.of(1955, 8, 22));
		DiseasesDTO disease294 = new DiseasesDTO(325.6, 67.0, 445.0, 56.5, 115.7, 32.7, 132.8, 390, 7, 2.6,
				LocalDate.of(1940, 3, 10));
		DiseasesDTO disease295 = new DiseasesDTO(335.8, 53.0, 345.0, 78.5, 125.7, 38.8, 138.7, 380, 6, 2.7,
				LocalDate.of(1858, 11, 5));
		DiseasesDTO disease296 = new DiseasesDTO(328.9, 45.0, 518.0, 87.0, 118.7, 34.0, 136.6, 350, 4, 2.4,
				LocalDate.of(1992, 7, 12));
		DiseasesDTO disease297 = new DiseasesDTO(332.3, 87.0, 422.4, 48.8, 122.6, 36.6, 138.4, 340, 6, 2.3,
				LocalDate.of(1986, 4, 30));
		DiseasesDTO disease298 = new DiseasesDTO(145.2, 38.0, 535.4, 70.0, 135.6, 32.4, 135.3, 320, 6, 3.6,
				LocalDate.of(1973, 9, 18));
		DiseasesDTO disease299 = new DiseasesDTO(318.2, 36.0, 108.6, 75.5, 108.5, 38.3, 138.2, 330, 4, 1.3,
				LocalDate.of(2061, 2, 25));
		DiseasesDTO disease300 = new DiseasesDTO(334.2, 91.0, 832.0, 89.5, 132.5, 34.3, 132.2, 330, 3, 3.2,
				LocalDate.of(1956, 6, 8));

		Collection<DiseasesDTO> collection = new ArrayList<DiseasesDTO>();

		collection.addAll(Arrays.asList(disease1, disease2, disease3, disease4, disease5, disease6, disease7, disease8,
				disease9, disease10, disease11, disease12, disease13, disease14, disease15, disease16, disease17,
				disease18, disease19, disease20, disease21, disease22, disease23, disease24, disease25, disease26,
				disease27, disease28, disease29, disease30, disease31, disease32, disease33, disease34, disease35,
				disease36, disease37, disease38, disease39, disease40, disease41, disease42, disease43, disease44,
				disease45, disease46, disease47, disease48, disease49, disease50, disease51, disease52, disease53,
				disease54, disease55, disease56, disease57, disease58, disease59, disease60, disease61, disease62,
				disease63, disease64, disease65, disease66, disease67, disease68, disease69, disease70, disease71,
				disease72, disease73, disease74, disease75, disease76, disease77, disease78, disease79, disease80,
				disease81, disease82, disease83, disease84, disease85, disease86, disease87, disease88, disease89,
				disease90, disease91, disease92, disease93, disease94, disease95, disease96, disease97, disease98,
				disease99, disease100, disease101, disease102, disease103, disease104, disease105, disease106,
				disease107, disease108, disease109, disease110, disease111, disease112, disease113, disease114,
				disease115, disease116, disease117, disease118, disease119, disease120, disease121, disease122,
				disease123, disease124, disease125, disease126, disease127, disease128, disease129, disease130,
				disease131, disease132, disease133, disease134, disease135, disease136, disease137, disease138,
				disease139, disease140, disease141, disease142, disease143, disease144, disease145, disease146,
				disease147, disease148, disease149, disease150, disease151, disease152, disease153, disease154,
				disease155, disease156, disease157, disease158, disease159, disease160, disease161, disease162,
				disease163, disease164, disease165, disease166, disease167, disease168, disease169, disease170,
				disease171, disease172, disease173, disease174, disease175, disease176, disease177, disease178,
				disease179, disease180, disease181, disease182, disease183, disease184, disease185, disease186,
				disease187, disease188, disease189, disease190, disease191, disease192, disease193, disease194,
				disease195, disease196, disease197, disease198, disease199, disease200, disease201, disease202,
				disease203, disease204, disease205, disease206, disease207, disease208, disease209, disease210,
				disease211, disease212, disease213, disease214, disease215, disease216, disease217, disease218,
				disease219, disease220, disease221, disease222, disease223, disease224, disease225, disease226,
				disease227, disease228, disease229, disease230, disease231, disease232, disease233, disease234,
				disease235, disease236, disease237, disease238, disease239, disease240, disease241, disease242,
				disease243, disease244, disease245, disease246, disease247, disease248, disease249, disease250,
				disease251, disease252, disease253, disease254, disease255, disease256, disease257, disease258,
				disease259, disease260, disease261, disease262, disease263, disease264, disease265, disease266,
				disease267, disease268, disease269, disease270, disease271, disease272, disease273, disease274,
				disease275, disease276, disease277, disease278, disease279, disease280, disease281, disease282,
				disease283, disease284, disease285, disease286, disease287, disease288, disease289, disease290,
				disease291, disease292, disease293, disease294, disease295, disease296, disease297, disease298,
				disease299, disease300));

		System.out.println(collection.size());

//		Iterator<DiseasesDTO> iterator = collection.iterator();
//		while (iterator.hasNext()) {
//			DiseasesDTO diseasesDTO = (DiseasesDTO) iterator.next();
//			System.out.println(diseasesDTO);
//		}

//		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
//			DiseasesDTO diseasesDTO = (DiseasesDTO) iterator.next();
//			System.out.println(diseasesDTO);
//		}

		for (DiseasesDTO diseasesDTO : collection) {
			System.out.println(diseasesDTO);
		}

		// adding new to dto to collection
		collection.add(
				new DiseasesDTO(334.2, 91.0, 832.0, 89.5, 132.5, 34.3, 132.2, 330, 3, 3.2, LocalDate.of(1956, 6, 8)));

		System.out.println("\nAdding another dto " + collection.size());

		// creating another collection
		Collection<DiseasesDTO> collection2 = new ArrayList<DiseasesDTO>();

		// adding dto to collection2
		collection2.add(
				new DiseasesDTO(324.2, 11.0, 832.3, 39.5, 132.5, 34.3, 132.2, 330, 3, 3.2, LocalDate.of(1956, 6, 8)));

		boolean b = collection.containsAll(collection2);
		System.err.println("\ncollection2 " + b);

		// adding collectin2 to collection
		collection.addAll(collection2);

		System.out.println("\ncollection " + collection.size());

		boolean c = collection.containsAll(collection2);
		System.out.println("\nc " + c);

//		System.out.println();
//		for (Iterator iterator2 = collection2.iterator(); iterator2.hasNext();) {
//			DiseasesDTO diseasesDTO = (DiseasesDTO) iterator2.next();
//			System.out.println(diseasesDTO);
//		}

		DiseasesDTO diseasesDTO = new DiseasesDTO(324.2, 11.0, 832.3, 39.5, 132.5, 34.3, 132.2, 330, 3, 3.2,
				LocalDate.of(1956, 6, 8));
		DiseasesDTO diseasesDTO2 = new DiseasesDTO(321.2, 12.0, 832.3, 34.5, 132.5, 34.3, 132.2, 330, 3, 3.2,
				LocalDate.of(1956, 6, 8));

		Collection<DiseasesDTO> collection3 = new ArrayList<DiseasesDTO>();
		collection3.addAll(Arrays.asList(diseasesDTO, diseasesDTO2));

		boolean d = collection.contains(collection3);
		System.out.println("collection3 " + d);

		DiseasesDTO disease400 = new DiseasesDTO(330.3, 86.0, 480.0, 27.5, 120.7, 45.5, 135.8, 330, 7, 2.5,
				LocalDate.of(2023, 1, 1));
		DiseasesDTO disease401 = new DiseasesDTO(340.2, 65.0, 370.0, 68.0, 130.7, 30.3, 130.3, 360, 7, 3.4,
				LocalDate.of(1896, 5, 15));
		DiseasesDTO disease403 = new DiseasesDTO(320.4, 67.0, 360.0, 46.0, 110.7, 30.5, 130.3, 300, 8, 2.40,
				LocalDate.of(1955, 8, 22));

		Collection<DiseasesDTO> collection4 = new ArrayList<DiseasesDTO>();
		collection.addAll(Arrays.asList(disease400, disease401, disease403));

		boolean e = collection.containsAll(collection4);
		System.out.println("collection4 " + e);

		System.err.println(collection.size());

		DiseasesDTO disease500 = new DiseasesDTO(330.3, 86.0, 480.0, 27.5, 120.7, 45.5, 135.8, 330, 7, 2.5,
				LocalDate.of(2023, 1, 1));
		DiseasesDTO disease501 = new DiseasesDTO(340.2, 65.0, 370.0, 68.0, 130.7, 30.3, 130.3, 360, 7, 3.4,
				LocalDate.of(1896, 5, 15));
		DiseasesDTO disease503 = new DiseasesDTO(320.4, 67.0, 360.0, 46.0, 110.7, 30.5, 130.3, 300, 8, 2.40,
				LocalDate.of(1955, 8, 22));

		Collection<DiseasesDTO> collection5 = new ArrayList<DiseasesDTO>();
		collection5.addAll(Arrays.asList(disease500, disease501, disease503));

		boolean f = collection.removeAll(collection5);
		System.out.println("removing " + f);
	}
}
