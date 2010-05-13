/* Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package tests.api.java.nio.charset;

import dalvik.annotation.KnownFailure;
import dalvik.annotation.TestLevel;
import dalvik.annotation.TestTargetClass;
import dalvik.annotation.TestTargetNew;

import java.nio.charset.CharacterCodingException;

@TestTargetClass(targets.Charsets.x_windows_950.class)

public class Charset_MultiByte_x_windows_950 extends Charset_AbstractTest {

    @Override
    protected void setUp() throws Exception {
        charsetName = "x-windows-950";

        testChars = theseChars(new int[]{
0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31,
32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47,
48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63,
64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79,
80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95,
96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111,
112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127,
167, 175, 176, 177, 183, 215, 247, 711, 713, 913, 945, 8211, 8242, 8364, 8451, 8544,
8592, 8725, 8756, 8786, 8853, 8895, 9472, 9508, 9552, 9582, 9612, 9650, 9698, 9733, 9792, 12288,
12318, 12549, 12579, 12963, 13198, 13252, 19968, 19998, 20028, 20060, 20094, 20126, 20160, 20190, 20221, 20253,
20283, 20313, 20343, 20373, 20403, 20433, 20463, 20493, 20523, 20553, 20584, 20615, 20652, 20682, 20712, 20742,
20772, 20803, 20833, 20864, 20894, 20924, 20956, 20986, 21020, 21050, 21082, 21112, 21142, 21179, 21209, 21239,
21269, 21300, 21330, 21360, 21390, 21420, 21450, 21480, 21510, 21540, 21570, 21600, 21630, 21664, 21694, 21726,
21756, 21786, 21816, 21846, 21877, 21907, 21937, 21967, 21999, 22029, 22060, 22090, 22120, 22150, 22181, 22211,
22241, 22271, 22302, 22334, 22369, 22400, 22430, 22460, 22492, 22522, 22553, 22583, 22613, 22644, 22675, 22705,
22735, 22767, 22797, 22827, 22857, 22887, 22917, 22947, 22977, 23008, 23038, 23068, 23100, 23130, 23160, 23191,
23221, 23253, 23283, 23315, 23346, 23376, 23406, 23436, 23468, 23498, 23528, 23559, 23589, 23620, 23650, 23686,
23716, 23750, 23784, 23814, 23844, 23874, 23906, 23936, 23966, 23996, 24029, 24061, 24091, 24125, 24155, 24185,
24215, 24245, 24275, 24305, 24335, 24365, 24395, 24425, 24455, 24485, 24515, 24545, 24575, 24605, 24640, 24670,
24703, 24733, 24763, 24793, 24823, 24853, 24884, 24914, 24944, 24974, 25004, 25034, 25064, 25095, 25125, 25155,
25185, 25215, 25256, 25286, 25323, 25353, 25384, 25414, 25445, 25475, 25505, 25536, 25567, 25606, 25636, 25667,
25697, 25727, 25757, 25787, 25817, 25847, 25877, 25907, 25937, 25967, 26000, 26030, 26060, 26092, 26122, 26152,
26183, 26213, 26244, 26274, 26304, 26334, 26364, 26395, 26425, 26455, 26485, 26515, 26546, 26576, 26606, 26642,
26673, 26703, 26733, 26763, 26793, 26823, 26854, 26884, 26917, 26948, 26978, 27010, 27040, 27070, 27106, 27136,
27166, 27196, 27226, 27262, 27292, 27322, 27353, 27384, 27414, 27444, 27476, 27506, 27537, 27567, 27597, 27627,
27657, 27687, 27718, 27749, 27779, 27819, 27849, 27879, 27911, 27941, 27992, 28022, 28052, 28082, 28112, 28142,
28185, 28216, 28246, 28276, 28306, 28336, 28366, 28396, 28426, 28457, 28494, 28524, 28555, 28585, 28615, 28646,
28676, 28706, 28736, 28766, 28796, 28826, 28856, 28887, 28918, 28951, 28982, 29012, 29042, 29072, 29103, 29134,
29164, 29194, 29224, 29254, 29287, 29317, 29347, 29377, 29407, 29437, 29467, 29498, 29528, 29558, 29588, 29618,
29650, 29684, 29718, 29748, 29778, 29808, 29840, 29871, 29903, 29934, 29964, 29994, 30024, 30054, 30084, 30114,
30144, 30174, 30204, 30234, 30264, 30294, 30325, 30355, 30388, 30418, 30448, 30480, 30511, 30541, 30571, 30601,
30631, 30663, 30693, 30723, 30753, 30787, 30818, 30848, 30878, 30908, 30938, 30969, 30999, 31029, 31059, 31090,
31120, 31150, 31181, 31211, 31242, 31272, 31302, 31335, 31365, 31395, 31425, 31455, 31485, 31515, 31547, 31584,
31618, 31648, 31678, 31708, 31739, 31769, 31799, 31831, 31861, 31892, 31922, 31952, 31982, 32012, 32043, 32074,
32104, 32134, 32166, 32196, 32227, 32259, 32289, 32319, 32350, 32380, 32410, 32566, 32596, 32626, 32657, 32687,
32717, 32747, 32779, 32809, 32839, 32871, 32901, 32931, 32962, 32992, 33022, 33053, 33085, 33115, 33145, 33175,
33205, 33237, 33267, 33297, 33327, 33358, 33388, 33418, 33448, 33489, 33519, 33549, 33579, 33609, 33651, 33682,
33712, 33742, 33772, 33802, 33833, 33863, 33893, 33926, 33956, 33986, 34023, 34054, 34084, 34115, 34145, 34176,
34206, 34237, 34268, 34298, 34328, 34358, 34388, 34419, 34449, 34479, 34512, 34549, 34579, 34609, 34639, 34669,
34701, 34731, 34761, 34791, 34821, 34851, 34881, 34913, 34943, 34974, 35004, 35034, 35064, 35094, 35125, 35155,
35185, 35215, 35245, 35282, 35312, 35342, 35372, 35402, 35432, 35462, 35492, 35522, 35552, 35582, 35612, 35642,
35672, 35703, 35733, 35895, 35925, 35955, 35985, 36015, 36047, 36077, 36109, 36196, 36228, 36259, 36289, 36319,
36349, 36379, 36409, 36439, 36470, 36500, 36530, 36561, 36591, 36621, 36652, 36683, 36763, 36799, 36832, 36862,
36892, 36924, 36955, 36985, 37015, 37045, 37076, 37106, 37136, 37166, 37196, 37226, 37257, 37287, 37317, 37347,
37377, 37411, 37445, 37475, 37506, 37536, 37568, 37598, 37628, 37658, 37688, 37718, 37749, 37780, 37810, 37840,
37870, 37900, 37930, 37960, 37992, 38263, 38296, 38326, 38356, 38428, 38458, 38488, 38518, 38548, 38579, 38610,
38640, 38670, 38700, 38731, 38761, 38792, 38822, 38852, 38883, 38913, 38944, 38977, 39007, 39080, 39110, 39141,
39171, 39201, 39231, 39262, 39318, 39348, 39378, 39408, 39438, 39468, 39498, 39528, 39592, 39622, 39654, 39684,
39714, 39745, 39775, 39805, 39835, 39865, 39895, 39927, 39959, 39990, 40020, 40051, 40165, 40195, 40226, 40256,
40287, 40317, 40347, 40377, 40407, 40437, 40467, 40565, 40595, 40628, 40659, 40690, 40720, 40750, 40780, 40810,
40845, 57344, 57374, 57404, 57434, 57464, 57494, 57524, 57554, 57584, 57614, 57644, 57674, 57704, 57734, 57764,
57794, 57824, 57854, 57884, 57914, 57944, 57974, 58004, 58034, 58064, 58094, 58124, 58154, 58184, 58214, 58244,
58274, 58304, 58334, 58364, 58394, 58424, 58454, 58484, 58514, 58544, 58574, 58604, 58634, 58664, 58694, 58724,
58754, 58784, 58814, 58844, 58874, 58904, 58934, 58964, 58994, 59024, 59054, 59084, 59114, 59144, 59174, 59204,
59234, 59264, 59294, 59324, 59354, 59384, 59414, 59444, 59474, 59504, 59534, 59564, 59594, 59624, 59654, 59684,
59714, 59744, 59774, 59804, 59834, 59864, 59894, 59924, 59954, 59984, 60014, 60044, 60074, 60104, 60134, 60164,
60194, 60224, 60254, 60284, 60314, 60344, 60374, 60404, 60434, 60464, 60494, 60524, 60554, 60584, 60614, 60644,
60674, 60704, 60734, 60764, 60794, 60824, 60854, 60884, 60914, 60944, 60974, 61004, 61034, 61064, 61094, 61124,
61154, 61184, 61214, 61244, 61274, 61304, 61334, 61364, 61394, 61424, 61454, 61484, 61514, 61544, 61574, 61604,
61634, 61664, 61694, 61724, 61754, 61784, 61814, 61844, 61874, 61904, 61934, 61964, 61994, 62024, 62054, 62084,
62114, 62144, 62174, 62204, 62234, 62264, 62294, 62324, 62354, 62384, 62414, 62444, 62474, 62504, 62534, 62564,
62594, 62624, 62654, 62684, 62714, 62744, 62774, 62804, 62834, 62864, 62894, 62924, 62954, 62984, 63014, 63044,
63074, 63104, 63134, 63164, 63194, 63224, 63254, 63284, 63314, 63344, 63374, 63404, 63434, 63464, 63494, 63524,
63554, 64012, 65072, 65102, 65281, 65311, 65343, 65373, 65504
            });

        testBytes = theseBytes(new int[]{
0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31,
32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47,
48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63,
64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79,
80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95,
96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111,
112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127,
161, 177, 161, 194, 162, 88, 161, 211, 161, 80, 161, 209, 161, 210, 163, 190,
163, 188, 163, 68, 163, 92, 161, 86, 161, 172, 163, 225, 162, 74, 162, 185,
161, 246, 162, 65, 161, 239, 161, 220, 161, 242, 161, 233, 162, 119, 162, 116,
162, 164, 162, 161, 162, 109, 161, 182, 162, 168, 161, 185, 161, 240, 161, 64,
161, 170, 163, 116, 163, 180, 161, 192, 162, 85, 162, 87, 164, 64, 165, 224,
201, 100, 201, 65, 176, 174, 168, 200, 164, 176, 165, 81, 165, 247, 201, 180,
202, 91, 167, 69, 203, 188, 203, 202, 205, 232, 171, 77, 173, 193, 173, 191,
173, 219, 176, 182, 216, 91, 216, 95, 182, 202, 220, 185, 224, 243, 228, 234,
236, 188, 164, 184, 162, 93, 190, 172, 203, 205, 203, 206, 187, 254, 165, 88,
202, 108, 168, 235, 208, 231, 220, 199, 241, 237, 168, 241, 176, 200, 241, 238,
164, 80, 232, 250, 168, 242, 166, 76, 202, 116, 225, 70, 164, 206, 165, 111,
166, 91, 202, 165, 167, 102, 203, 235, 203, 227, 206, 72, 206, 76, 206, 78,
173, 243, 208, 247, 176, 225, 176, 220, 212, 113, 216, 109, 179, 237, 220, 216,
182, 226, 185, 198, 229, 68, 228, 251, 190, 185, 236, 195, 195, 96, 245, 196,
201, 198, 171, 170, 249, 107, 167, 163, 169, 89, 203, 249, 206, 81, 209, 81,
212, 177, 176, 242, 216, 161, 216, 126, 220, 233, 225, 93, 185, 211, 229, 76,
236, 204, 167, 167, 206, 96, 164, 210, 169, 94, 182, 248, 201, 206, 167, 173,
204, 74, 206, 115, 206, 116, 174, 82, 177, 64, 177, 66, 216, 187, 216, 197,
220, 249, 225, 110, 225, 115, 233, 86, 236, 208, 164, 108, 212, 240, 167, 185,
209, 104, 216, 213, 185, 235, 177, 78, 201, 213, 204, 89, 185, 240, 202, 199,
204, 92, 206, 171, 174, 111, 177, 83, 177, 92, 216, 233, 221, 86, 225, 164,
229, 109, 192, 172, 164, 116, 180, 83, 169, 173, 180, 85, 185, 243, 183, 70,
169, 177, 177, 103, 185, 248, 245, 203, 166, 161, 171, 218, 233, 116, 177, 109,
171, 224, 216, 246, 164, 223, 202, 221, 169, 193, 171, 228, 206, 202, 206, 195,
177, 118, 209, 167, 177, 162, 213, 91, 221, 101, 180, 106, 183, 91, 225, 200,
188, 162, 188, 168, 188, 169, 190, 210, 236, 230, 249, 186, 221, 117, 206, 211,
201, 230, 169, 211, 169, 225, 169, 238, 206, 218, 171, 246, 174, 193, 174, 185,
213, 103, 177, 189, 177, 196, 180, 122, 217, 99, 183, 112, 221, 126, 221, 162,
217, 98, 225, 237, 217, 90, 190, 216, 233, 174, 194, 94, 244, 77, 233, 175,
177, 207, 221, 188, 180, 180, 217, 124, 177, 220, 166, 175, 169, 254, 172, 81,
209, 213, 213, 169, 183, 121, 186, 90, 233, 181, 242, 75, 176, 210, 177, 230,
201, 240, 168, 65, 170, 83, 170, 85, 207, 86, 172, 89, 207, 79, 209, 236,
209, 226, 209, 224, 213, 180, 213, 204, 213, 188, 217, 217, 217, 209, 217, 172,
217, 216, 221, 228, 221, 205, 183, 167, 226, 64, 226, 76, 229, 213, 229, 202,
188, 207, 233, 215, 233, 203, 192, 207, 192, 204, 239, 226, 242, 80, 245, 209,
198, 86, 209, 249, 233, 223, 183, 179, 213, 218, 194, 108, 165, 192, 178, 64,
237, 77, 174, 241, 201, 248, 203, 91, 168, 85, 170, 106, 172, 117, 204, 246,
207, 167, 172, 122, 210, 76, 210, 72, 175, 75, 178, 71, 214, 64, 178, 97,
181, 65, 180, 229, 180, 242, 213, 228, 222, 95, 222, 85, 226, 108, 186, 173,
226, 126, 186, 120, 226, 118, 230, 73, 230, 90, 237, 79, 233, 236, 237, 86,
233, 246, 242, 98, 244, 102, 197, 244, 168, 96, 205, 89, 172, 181, 210, 113,
214, 88, 214, 75, 181, 77, 222, 108, 222, 115, 226, 187, 230, 99, 191, 82,
192, 236, 242, 106, 198, 121, 192, 240, 170, 170, 218, 107, 242, 113, 203, 101,
207, 194, 175, 86, 178, 114, 222, 173, 230, 117, 239, 254, 203, 107, 172, 194,
210, 180, 214, 120, 218, 126, 181, 94, 222, 180, 186, 192, 237, 105, 237, 110,
196, 110, 207, 216, 191, 94, 202, 70, 207, 219, 178, 165, 237, 115, 172, 207,
210, 199, 181, 108, 222, 204, 230, 181, 191, 97, 194, 125, 249, 204, 181, 113,
181, 114, 178, 176, 205, 120, 210, 207, 214, 169, 218, 189, 183, 251, 230, 190,
193, 64, 195, 169, 170, 190, 207, 242, 210, 225, 178, 185, 218, 209, 222, 240,
226, 242, 189, 88, 191, 106, 237, 172, 242, 163, 246, 246, 210, 234, 218, 212,
227, 67, 194, 167, 207, 250, 210, 237, 218, 215, 227, 72, 191, 112, 242, 166,
210, 248, 223, 66, 237, 185, 179, 186, 172, 242, 178, 195, 218, 223, 184, 97,
227, 93, 189, 105, 230, 216, 234, 195, 237, 191, 240, 99, 195, 178, 246, 250,
205, 168, 214, 222, 223, 84, 234, 202, 244, 171, 211, 90, 181, 181, 214, 238,
181, 179, 223, 88, 227, 117, 227, 108, 189, 116, 230, 233, 234, 205, 193, 104,
194, 182, 196, 126, 248, 254, 166, 206, 170, 201, 184, 112, 208, 78, 189, 126,
214, 248, 230, 246, 181, 192, 234, 230, 215, 66, 230, 252, 181, 194, 205, 173,
208, 91, 208, 88, 219, 72, 215, 80, 219, 79, 223, 119, 184, 161, 231, 68,
234, 236, 242, 194, 166, 220, 215, 82, 211, 113, 231, 74, 247, 239, 203, 161,
205, 191, 173, 98, 173, 102, 206, 65, 175, 237, 175, 243, 215, 94, 178, 247,
215, 116, 219, 116, 219, 168, 181, 220, 223, 199, 223, 215, 223, 176, 223, 179,
227, 173, 227, 178, 231, 115, 189, 183, 231, 76, 191, 187, 234, 253, 237, 244,
237, 254, 240, 171, 242, 212, 196, 169, 245, 241, 247, 76, 176, 64, 208, 169,
211, 189, 179, 76, 181, 241, 223, 232, 184, 187, 227, 235, 231, 187, 231, 175,
191, 196, 193, 177, 238, 98, 240, 187, 195, 199, 196, 247, 208, 170, 191, 197,
211, 215, 179, 79, 219, 202, 223, 247, 187, 114, 231, 202, 238, 113, 240, 210,
247, 82, 179, 87, 238, 121, 168, 164, 231, 210, 176, 81, 215, 203, 219, 226,
184, 229, 224, 70, 187, 126, 189, 212, 235, 126, 191, 213, 238, 174, 240, 237,
195, 209, 197, 64, 248, 194, 168, 166, 168, 168, 193, 199, 235, 177, 182, 74,
228, 84, 189, 228, 196, 186, 168, 170, 219, 237, 189, 236, 215, 218, 184, 242,
228, 91, 231, 249, 191, 229, 240, 250, 195, 221, 247, 94, 184, 250, 211, 232,
219, 252, 228, 103, 232, 71, 241, 73, 168, 175, 203, 166, 208, 182, 211, 234,
215, 229, 185, 71, 187, 191, 235, 209, 202, 82, 170, 242, 215, 238, 215, 236,
224, 164, 232, 90, 176, 117, 185, 84, 190, 75, 241, 80, 198, 111, 179, 168,
220, 98, 182, 116, 185, 100, 224, 197, 228, 170, 228, 123, 232, 101, 232, 123,
191, 251, 191, 254, 235, 228, 238, 209, 193, 228, 194, 232, 241, 102, 243, 101,
243, 110, 245, 65, 246, 102, 247, 110, 248, 203, 170, 248, 185, 104, 236, 75,
194, 243, 170, 250, 205, 219, 176, 164, 179, 179, 185, 106, 241, 111, 187, 220,
220, 168, 192, 75, 243, 124, 249, 173, 173, 178, 232, 179, 194, 254, 248, 79,
247, 114, 173, 182, 232, 187, 239, 69, 245, 81, 173, 183, 246, 116, 216, 79,
187, 229, 192, 96, 195, 73, 198, 97, 173, 186, 185, 165, 190, 115, 236, 101,
195, 77, 245, 93, 247, 126, 249, 195, 176, 169, 245, 102, 187, 236, 241, 188,
198, 75, 187, 237, 228, 225, 236, 161, 239, 109, 241, 205, 243, 208, 245, 108,
245, 116, 247, 182, 197, 235, 249, 120, 179, 190, 190, 161, 236, 171, 239, 166,
241, 219, 243, 227, 245, 126, 246, 191, 197, 195, 247, 196, 249, 124, 179, 191,
196, 83, 196, 84, 232, 241, 248, 118, 232, 243, 245, 185, 241, 233, 197, 198,
192, 115, 250, 64, 250, 94, 250, 124, 250, 188, 250, 218, 250, 248, 251, 87,
251, 117, 251, 181, 251, 211, 251, 241, 252, 80, 252, 110, 252, 174, 252, 204,
252, 234, 253, 73, 253, 103, 253, 167, 253, 197, 253, 227, 254, 66, 254, 96,
254, 126, 254, 190, 254, 220, 254, 250, 142, 89, 142, 119, 142, 183, 142, 213,
142, 243, 143, 82, 143, 112, 143, 176, 143, 206, 143, 236, 144, 75, 144, 105,
144, 169, 144, 199, 144, 229, 145, 68, 145, 98, 145, 162, 145, 192, 145, 222,
145, 252, 146, 91, 146, 121, 146, 185, 146, 215, 146, 245, 147, 84, 147, 114,
147, 178, 147, 208, 147, 238, 148, 77, 148, 107, 148, 171, 148, 201, 148, 231,
149, 70, 149, 100, 149, 164, 149, 194, 149, 224, 149, 254, 150, 93, 150, 123,
150, 187, 150, 217, 150, 247, 151, 86, 151, 116, 151, 180, 151, 210, 151, 240,
152, 79, 152, 109, 152, 173, 152, 203, 152, 233, 153, 72, 153, 102, 153, 166,
153, 196, 153, 226, 154, 65, 154, 95, 154, 125, 154, 189, 154, 219, 154, 249,
155, 88, 155, 118, 155, 182, 155, 212, 155, 242, 156, 81, 156, 111, 156, 175,
156, 205, 156, 235, 157, 74, 157, 104, 157, 168, 157, 198, 157, 228, 158, 67,
158, 97, 158, 161, 158, 191, 158, 221, 158, 251, 159, 90, 159, 120, 159, 184,
159, 214, 159, 244, 160, 83, 160, 113, 160, 177, 160, 207, 160, 237, 129, 76,
129, 106, 129, 170, 129, 200, 129, 230, 130, 69, 130, 99, 130, 163, 130, 193,
130, 223, 130, 253, 131, 92, 131, 122, 131, 186, 131, 216, 131, 246, 132, 85,
132, 115, 132, 179, 132, 209, 132, 239, 133, 78, 133, 108, 133, 172, 133, 202,
133, 232, 134, 71, 134, 101, 134, 165, 134, 195, 134, 225, 135, 64, 135, 94,
135, 124, 135, 188, 135, 218, 135, 248, 136, 87, 136, 117, 136, 181, 136, 211,
136, 241, 137, 80, 137, 110, 137, 174, 137, 204, 137, 234, 138, 73, 138, 103,
138, 167, 138, 197, 138, 227, 139, 66, 139, 96, 139, 126, 139, 190, 139, 220,
139, 250, 140, 89, 140, 119, 140, 183, 140, 213, 140, 243, 141, 82, 141, 112,
141, 176, 141, 206, 141, 236, 198, 172, 198, 202, 198, 232, 199, 71, 199, 101,
199, 165, 199, 195, 199, 225, 200, 64, 200, 94, 200, 124, 200, 188, 200, 218,
200, 248, 201, 74, 161, 74, 161, 201, 161, 73, 161, 72, 161, 196, 161, 98,
162, 70
            });

        super.setUp();
    }

    @TestTargetNew(
        level = TestLevel.PARTIAL_COMPLETE,
        method = "functionalCoDec_REPR",
        args = {}
    )
    @Override
    public void test_CodecDynamic() throws CharacterCodingException {
        super.test_CodecDynamic();
    }

    @TestTargetNew(
        level = TestLevel.PARTIAL_COMPLETE,
        method = "functionalCoDec_REPR",
        args = {}
    )
    @Override
    public void test_Decode() throws CharacterCodingException {
        super.test_Decode();
    }

    @TestTargetNew(
        level = TestLevel.PARTIAL_COMPLETE,
        method = "functionalCoDec_REPR",
        args = {}
    )
    @Override
    public void test_Encode() throws CharacterCodingException {
        super.test_Encode();
    }

    @TestTargetNew(
        level = TestLevel.PARTIAL_COMPLETE,
        method = "functionalCoDec_REPR",
        args = {}
    )
    @Override
    public void test_nameMatch() {
        super.test_nameMatch();
    }

}
