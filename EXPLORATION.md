# חקר Android Studio - תשובות התלמיד

**שם התלמיד:** אגם רענן
**תאריך:** 06/02/2026

---

## חלק א' - סיור ב-Android Studio (30 נקודות)

### שאלה 1: תיקיות ראשיות (10 נקודות)
צלם screenshot של חלון הProject (תצוגת Android) והדבק כאן:

<img width="725" height="229" alt="image" src="https://github.com/user-attachments/assets/f0d914a4-78e7-4a5b-8f9e-c7392e83875b" />



רשום את שמות 3 התיקיות הראשיות שאתה רואה:

1. Trial
2. External Libraries
3. Scratches and Consoles

### שאלה 2: AndroidManifest.xml (10 נקודות)
צלם screenshot של קובץ AndroidManifest.xml והדבק כאן:

<img width="1520" height="1129" alt="image" src="https://github.com/user-attachments/assets/55edbc86-41d8-4d65-b3ab-bddf54aa0bc4" />


**מה התפקיד של קובץ זה? (2-3 משפטים)**

הוא קובץ שמגדיר למערכת אנדרואיד את מבנה האפליקציה ואת אופן ההפעלה שלה.
הוא כולל מידע על ה־Activities, ההרשאות וה־Activity הראשית שממנה האפליקציה נפתחת.

### שאלה 3: תיקיית res (10 נקודות)
צלם screenshot של תוכן תיקיית res והדבק כאן:

<img width="327" height="293" alt="image" src="https://github.com/user-attachments/assets/ac3a2d64-a31f-439d-900f-b33c717e3d6f" />


**רשום 3 תיקיות משנה שנמצאות בתוך res:**

1. layout
2. drawable
3. xml

**מה נמצא בכל אחת מהתיקיות האלה?**

בlayout נמצא ה-activity main אשר הוא הקובץ שמגדיר את העיצוב והפריסה של המסך הראשי של האפליקציה.
בdrawable נמצא כל הגרפיקה של האפליקציה. למשל - באפליקציה ריקה הגרפיקה היא הלוגו של האפליקציה...
בxml נמצאים קבצי הגדרות או נתונים שהאפליקציה קוראת בזמן ריצה.

## חלק ב' - עבודה עם Gradle (40 נקודות)

### שאלה 4: build.gradle (Module) (15 נקודות)
צלם screenshot של build.gradle (Module: app) אחרי שהוספת את Gson:

<img width="1770" height="1226" alt="image" src="https://github.com/user-attachments/assets/d8acfac2-d327-4a8f-976a-c8f0255f5f17" />

<img width="1082" height="641" alt="image" src="https://github.com/user-attachments/assets/04571d57-8358-4d40-9af0-4271d7e14a6d" />


**איזו שורה הוספת בדיוק?**

```gradle
implementation 'com.google.code.gson:gson:2.10.1'
```

---

### שאלה 5: מה זה Gson? (15 נקודות)

**הסבר במילים שלך: מה Gson עושה ולמה זה שימושי?**

הפונקציה Gson היא ספרייה של גוגל שמאפשרת להמיר בין אובייקטים של ג'אווה לJSON וההיפך.
באמצעותה ניתן לשמור, לשלוח או לקרוא נתונים בצורה קלה ונוחה באפליקציה.


**תן דוגמה: מתי תשתמש ב-Gson באפליקציה אמיתית? (למשל באפליקציות כמו WhatsApp או Instagram)**


כשאפליקציה שולחת הודעה או טוענת את הפיד, הנתונים מגיעים בפורמט JSON.
הGson מאפשרת המרת נתונים האלה לאובייקטים בשפתJava כדי שהאפליקציה תוכל להשתמש בהם בקלות וגם להיפך..

---

### שאלה 6: Gradle Sync (10 נקודות)

**מה קורה כשלוחצים על "Sync Now"?**

כאשר לוחצים על "Sync Now", גריידל מסנכרן את הפרויקט עם קבצי ההגדרות, מוריד את הספריות (dependencies) החדשות שהוספנו ומעדכן את הפרויקט כך שיוכל להשתמש בהן בקוד.


**מה יקרה אם לא נלחץ על Sync Now אחרי שהוספנו dependency?**

אם לא נלחץ על Sync Now אחרי שהוספנו dependency, זה לא יוריד את הספרייה החדשה והקוד שישתמש בה יציג שגיאות כי הפרויקט לא מזהה את הספרייה.

---

## חלק ג' - ארגון קבצים (30 נקודות)

### שאלה 7: strings.xml (10 נקודות)

**צלם screenshot של קובץ strings.xml שלך (עם לפחות 3 strings):**

<img width="1133" height="221" alt="image" src="https://github.com/user-attachments/assets/9ab8dfee-58ad-4f12-a58a-9405cd2059eb" />



**רשום את 3 ה-strings שהוספת:**

1. <string name="app_name">Trial</string>
2.  <string name="welcome_message">Welcome to Trial!</string>
3. <string name="button_start">Start</string>

---

### שאלה 8: Layout File חדש (10 נקודות)

**איך יצרת layout file חדש? תאר את התהליך צעד אחר צעד:**

1. נכנסתי לתיקיית res/layout ב־Project view של Android Studio.
2. לחצתי עם הכפתור הימני על layout בחרתי New Layout Resource File.
3. הזנתי שם לקובץ (למשל activity_second) ובחרתי את ה־Root Element (כמו ConstraintLayout).
4. לחצתי OK הקובץ נוצר ונפתח לעריכה.

**צלם screenshot של ה-layout החדש:**

<img width="1889" height="298" alt="image" src="https://github.com/user-attachments/assets/6b1daae2-62ff-49e1-bfe6-0747ed346a0a" />


### שאלה 9: הבנה כללית (10 נקודות)

**מה ההבדל בין build.gradle (Project) ל-build.gradle (Module)?**


הבילד.גריידל של ה‑Project מנהל הגדרות כלליות של כל הפרויקט, כמו גרסת Gradle, plugins גלובליים והגדרות repositories.
הבילד.גריידל של ה‑Module מנהל את ההגדרות של המודול הספציפי, כולל dependencies, גרסאות SDK והגדרות build.

**למה חשוב להפריד בין קוד (java/) לבין משאבים (res/)?**


הפרדה זו מאפשרת סדר וארגון בפרויקט, הקלה על ניהול הקוד והגרפיקה, ותאימות ל־Android Studio שמצפה למבנה מסודר כדי להמיר ולהריץ את האפליקציה נכון.

---

## שאלות בונוס (10 נקודות נוספים)

### בונוס 1: (5 נקודות)
**מצא ותעד dependency נוסף שלא דיברנו עליו בשיעור. מה הוא עושה?**

**Dependency:**
```gradle

```

**מה הוא עושה:**



---

### בונוס 2: (5 נקודות)
**מה ההבדל בין minSdk ל-targetSdk ב-build.gradle?**




---

## סיכום אישי

**מה למדת היום שהכי עזר לך להבין את Android Studio?**




**מה היה הכי מאתגר?**




---

**סיימתי את המשימה! ✅**

**זמן שלקח לי:** ______ דקות
