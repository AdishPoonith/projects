.class public Lkotlin/jvm/internal/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lkotlin/jvm/internal/u;

.field private static final b:[Lia/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "kotlin.reflect.jvm.internal.ReflectionFactoryImpl"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/internal/u;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    goto :goto_0

    :catch_0
    nop

    :goto_0
    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    new-instance v0, Lkotlin/jvm/internal/u;

    invoke-direct {v0}, Lkotlin/jvm/internal/u;-><init>()V

    :goto_1
    sput-object v0, Lkotlin/jvm/internal/t;->a:Lkotlin/jvm/internal/u;

    const/4 v0, 0x0

    new-array v0, v0, [Lia/c;

    sput-object v0, Lkotlin/jvm/internal/t;->b:[Lia/c;

    return-void
.end method

.method public static a(Lkotlin/jvm/internal/i;)Lia/e;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/t;->a:Lkotlin/jvm/internal/u;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/u;->a(Lkotlin/jvm/internal/i;)Lia/e;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/Class;)Lia/c;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/t;->a:Lkotlin/jvm/internal/u;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Class;)Lia/c;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/lang/Class;)Lia/d;
    .locals 2

    sget-object v0, Lkotlin/jvm/internal/t;->a:Lkotlin/jvm/internal/u;

    const-string v1, ""

    invoke-virtual {v0, p0, v1}, Lkotlin/jvm/internal/u;->c(Ljava/lang/Class;Ljava/lang/String;)Lia/d;

    move-result-object p0

    return-object p0
.end method

.method public static d(Lkotlin/jvm/internal/o;)Lia/f;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/t;->a:Lkotlin/jvm/internal/u;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/u;->d(Lkotlin/jvm/internal/o;)Lia/f;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lkotlin/jvm/internal/h;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/t;->a:Lkotlin/jvm/internal/u;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/u;->e(Lkotlin/jvm/internal/h;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static f(Lkotlin/jvm/internal/m;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/t;->a:Lkotlin/jvm/internal/u;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/u;->f(Lkotlin/jvm/internal/m;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
