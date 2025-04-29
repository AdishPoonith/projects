.class public abstract Lcom/google/android/gms/internal/auth/g2;
.super Lcom/google/android/gms/internal/auth/a1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/android/gms/internal/auth/g2<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lcom/google/android/gms/internal/auth/e2<",
        "TMessageType;TBuilderType;>;>",
        "Lcom/google/android/gms/internal/auth/a1<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# static fields
.field private static final zzb:Ljava/util/Map;


# instance fields
.field protected zzc:Lcom/google/android/gms/internal/auth/k4;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/auth/g2;->zzb:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/auth/a1;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/auth/k4;->a()Lcom/google/android/gms/internal/auth/k4;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/auth/g2;->zzc:Lcom/google/android/gms/internal/auth/k4;

    return-void
.end method

.method static a(Ljava/lang/Class;)Lcom/google/android/gms/internal/auth/g2;
    .locals 4

    sget-object v0, Lcom/google/android/gms/internal/auth/g2;->zzb:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/auth/g2;

    if-nez v1, :cond_0

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-static {v1, v2, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/auth/g2;

    goto :goto_0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Class initialization cannot fail."

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    :goto_0
    if-nez v1, :cond_2

    invoke-static {p0}, Lcom/google/android/gms/internal/auth/u4;->e(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/auth/g2;

    const/4 v2, 0x6

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v3}, Lcom/google/android/gms/internal/auth/g2;->g(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/auth/g2;

    if-eqz v1, :cond_1

    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0

    :cond_2
    :goto_1
    return-object v1
.end method

.method protected static b(Lcom/google/android/gms/internal/auth/g2;[B)Lcom/google/android/gms/internal/auth/g2;
    .locals 3

    array-length v0, p1

    sget-object v1, Lcom/google/android/gms/internal/auth/w1;->b:Lcom/google/android/gms/internal/auth/w1;

    const/4 v2, 0x0

    invoke-static {p0, p1, v2, v0, v1}, Lcom/google/android/gms/internal/auth/g2;->h(Lcom/google/android/gms/internal/auth/g2;[BIILcom/google/android/gms/internal/auth/w1;)Lcom/google/android/gms/internal/auth/g2;

    move-result-object p0

    if-eqz p0, :cond_3

    const/4 p1, 0x1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, v0}, Lcom/google/android/gms/internal/auth/g2;->g(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Byte;

    invoke-virtual {v1}, Ljava/lang/Byte;->byteValue()B

    move-result v1

    if-ne v1, p1, :cond_0

    goto :goto_1

    :cond_0
    if-eqz v1, :cond_2

    invoke-static {}, Lcom/google/android/gms/internal/auth/p3;->a()Lcom/google/android/gms/internal/auth/p3;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/auth/p3;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/auth/s3;

    move-result-object v1

    invoke-interface {v1, p0}, Lcom/google/android/gms/internal/auth/s3;->c(Ljava/lang/Object;)Z

    move-result v1

    if-eq p1, v1, :cond_1

    move-object p1, v0

    goto :goto_0

    :cond_1
    move-object p1, p0

    :goto_0
    const/4 v2, 0x2

    invoke-virtual {p0, v2, p1, v0}, Lcom/google/android/gms/internal/auth/g2;->g(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/auth/i4;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/auth/i4;-><init>(Lcom/google/android/gms/internal/auth/g3;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/auth/i4;->a()Lcom/google/android/gms/internal/auth/m2;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/auth/m2;->e(Lcom/google/android/gms/internal/auth/g3;)Lcom/google/android/gms/internal/auth/m2;

    throw p1

    :cond_3
    :goto_1
    return-object p0
.end method

.method protected static c()Lcom/google/android/gms/internal/auth/j2;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/auth/q3;->e()Lcom/google/android/gms/internal/auth/q3;

    move-result-object v0

    return-object v0
.end method

.method static varargs d(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    instance-of p1, p0, Ljava/lang/RuntimeException;

    if-nez p1, :cond_1

    instance-of p1, p0, Ljava/lang/Error;

    if-eqz p1, :cond_0

    check-cast p0, Ljava/lang/Error;

    throw p0

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Unexpected exception thrown by generated accessor method."

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_1
    check-cast p0, Ljava/lang/RuntimeException;

    throw p0

    :catch_1
    move-exception p0

    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Couldn\'t use Java reflection to implement protocol message reflection."

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method protected static e(Lcom/google/android/gms/internal/auth/g3;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    new-instance p1, Lcom/google/android/gms/internal/auth/r3;

    const-string v0, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a"

    invoke-direct {p1, p0, v0, p2}, Lcom/google/android/gms/internal/auth/r3;-><init>(Lcom/google/android/gms/internal/auth/g3;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p1
.end method

.method protected static f(Ljava/lang/Class;Lcom/google/android/gms/internal/auth/g2;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/auth/g2;->zzb:Ljava/util/Map;

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static h(Lcom/google/android/gms/internal/auth/g2;[BIILcom/google/android/gms/internal/auth/w1;)Lcom/google/android/gms/internal/auth/g2;
    .locals 6

    const/4 p2, 0x4

    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0, v0}, Lcom/google/android/gms/internal/auth/g2;->g(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/auth/g2;

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/auth/p3;->a()Lcom/google/android/gms/internal/auth/p3;

    move-result-object p2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/auth/p3;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/auth/s3;

    move-result-object p2

    new-instance v5, Lcom/google/android/gms/internal/auth/d1;

    invoke-direct {v5, p4}, Lcom/google/android/gms/internal/auth/d1;-><init>(Lcom/google/android/gms/internal/auth/w1;)V

    const/4 v3, 0x0

    move-object v0, p2

    move-object v1, p0

    move-object v2, p1

    move v4, p3

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/auth/s3;->a(Ljava/lang/Object;[BIILcom/google/android/gms/internal/auth/d1;)V

    invoke-interface {p2, p0}, Lcom/google/android/gms/internal/auth/s3;->b(Ljava/lang/Object;)V

    iget p1, p0, Lcom/google/android/gms/internal/auth/a1;->zza:I

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
    :try_end_0
    .catch Lcom/google/android/gms/internal/auth/m2; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lcom/google/android/gms/internal/auth/i4; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-static {}, Lcom/google/android/gms/internal/auth/m2;->f()Lcom/google/android/gms/internal/auth/m2;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/auth/m2;->e(Lcom/google/android/gms/internal/auth/g3;)Lcom/google/android/gms/internal/auth/m2;

    throw p1

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    instance-of p2, p2, Lcom/google/android/gms/internal/auth/m2;

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/auth/m2;

    throw p0

    :cond_1
    new-instance p2, Lcom/google/android/gms/internal/auth/m2;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/auth/m2;-><init>(Ljava/io/IOException;)V

    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/auth/m2;->e(Lcom/google/android/gms/internal/auth/g3;)Lcom/google/android/gms/internal/auth/m2;

    throw p2

    :catch_2
    move-exception p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/auth/i4;->a()Lcom/google/android/gms/internal/auth/m2;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/auth/m2;->e(Lcom/google/android/gms/internal/auth/g3;)Lcom/google/android/gms/internal/auth/m2;

    throw p1

    :catch_3
    move-exception p1

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/auth/m2;->e(Lcom/google/android/gms/internal/auth/g3;)Lcom/google/android/gms/internal/auth/m2;

    throw p1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return v0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_2

    return v0

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/auth/p3;->a()Lcom/google/android/gms/internal/auth/p3;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/auth/p3;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/auth/s3;

    move-result-object v0

    check-cast p1, Lcom/google/android/gms/internal/auth/g2;

    invoke-interface {v0, p0, p1}, Lcom/google/android/gms/internal/auth/s3;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method protected abstract g(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/auth/a1;->zza:I

    if-eqz v0, :cond_0

    return v0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/auth/p3;->a()Lcom/google/android/gms/internal/auth/p3;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/auth/p3;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/auth/s3;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/auth/s3;->zza(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/auth/a1;->zza:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/auth/i3;->a(Lcom/google/android/gms/internal/auth/g3;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic zzd()Lcom/google/android/gms/internal/auth/f3;
    .locals 2

    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/auth/g2;->g(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/auth/e2;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/auth/e2;->d(Lcom/google/android/gms/internal/auth/g2;)Lcom/google/android/gms/internal/auth/e2;

    return-object v0
.end method

.method public final synthetic zzh()Lcom/google/android/gms/internal/auth/g3;
    .locals 2

    const/4 v0, 0x6

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/auth/g2;->g(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/auth/g2;

    return-object v0
.end method
