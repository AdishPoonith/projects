.class public abstract Lcom/google/crypto/tink/shaded/protobuf/z;
.super Lcom/google/crypto/tink/shaded/protobuf/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/crypto/tink/shaded/protobuf/z$b;,
        Lcom/google/crypto/tink/shaded/protobuf/z$e;,
        Lcom/google/crypto/tink/shaded/protobuf/z$d;,
        Lcom/google/crypto/tink/shaded/protobuf/z$c;,
        Lcom/google/crypto/tink/shaded/protobuf/z$a;,
        Lcom/google/crypto/tink/shaded/protobuf/z$f;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/crypto/tink/shaded/protobuf/z<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lcom/google/crypto/tink/shaded/protobuf/z$a<",
        "TMessageType;TBuilderType;>;>",
        "Lcom/google/crypto/tink/shaded/protobuf/a<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# static fields
.field private static defaultInstanceMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Lcom/google/crypto/tink/shaded/protobuf/z<",
            "**>;>;"
        }
    .end annotation
.end field


# instance fields
.field protected memoizedSerializedSize:I

.field protected unknownFields:Lcom/google/crypto/tink/shaded/protobuf/p1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/z;->defaultInstanceMap:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/a;-><init>()V

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p1;->c()Lcom/google/crypto/tink/shaded/protobuf/p1;

    move-result-object v0

    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/z;->unknownFields:Lcom/google/crypto/tink/shaded/protobuf/p1;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/z;->memoizedSerializedSize:I

    return-void
.end method

.method static varargs A(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
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

.method protected static final B(Lcom/google/crypto/tink/shaded/protobuf/z;Z)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/crypto/tink/shaded/protobuf/z<",
            "TT;*>;>(TT;Z)Z"
        }
    .end annotation

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/z$f;->j:Lcom/google/crypto/tink/shaded/protobuf/z$f;

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->u(Lcom/google/crypto/tink/shaded/protobuf/z$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Byte;

    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    if-nez v0, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/d1;->a()Lcom/google/crypto/tink/shaded/protobuf/d1;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/d1;->e(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/h1;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/h1;->c(Ljava/lang/Object;)Z

    move-result v0

    if-eqz p1, :cond_3

    sget-object p1, Lcom/google/crypto/tink/shaded/protobuf/z$f;->k:Lcom/google/crypto/tink/shaded/protobuf/z$f;

    if-eqz v0, :cond_2

    move-object v1, p0

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/z;->v(Lcom/google/crypto/tink/shaded/protobuf/z$f;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return v0
.end method

.method protected static D(Lcom/google/crypto/tink/shaded/protobuf/b0$i;)Lcom/google/crypto/tink/shaded/protobuf/b0$i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/crypto/tink/shaded/protobuf/b0$i<",
            "TE;>;)",
            "Lcom/google/crypto/tink/shaded/protobuf/b0$i<",
            "TE;>;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0xa

    goto :goto_0

    :cond_0
    mul-int/lit8 v0, v0, 0x2

    :goto_0
    invoke-interface {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/b0$i;->c(I)Lcom/google/crypto/tink/shaded/protobuf/b0$i;

    move-result-object p0

    return-object p0
.end method

.method protected static F(Lcom/google/crypto/tink/shaded/protobuf/s0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/f1;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/f1;-><init>(Lcom/google/crypto/tink/shaded/protobuf/s0;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0
.end method

.method protected static G(Lcom/google/crypto/tink/shaded/protobuf/z;Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/q;)Lcom/google/crypto/tink/shaded/protobuf/z;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/crypto/tink/shaded/protobuf/z<",
            "TT;*>;>(TT;",
            "Lcom/google/crypto/tink/shaded/protobuf/i;",
            "Lcom/google/crypto/tink/shaded/protobuf/q;",
            ")TT;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/z;->I(Lcom/google/crypto/tink/shaded/protobuf/z;Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/q;)Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object p0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/z;->s(Lcom/google/crypto/tink/shaded/protobuf/z;)Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object p0

    return-object p0
.end method

.method protected static H(Lcom/google/crypto/tink/shaded/protobuf/z;[BLcom/google/crypto/tink/shaded/protobuf/q;)Lcom/google/crypto/tink/shaded/protobuf/z;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/crypto/tink/shaded/protobuf/z<",
            "TT;*>;>(TT;[B",
            "Lcom/google/crypto/tink/shaded/protobuf/q;",
            ")TT;"
        }
    .end annotation

    array-length v0, p1

    const/4 v1, 0x0

    invoke-static {p0, p1, v1, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/z;->K(Lcom/google/crypto/tink/shaded/protobuf/z;[BIILcom/google/crypto/tink/shaded/protobuf/q;)Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object p0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/z;->s(Lcom/google/crypto/tink/shaded/protobuf/z;)Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object p0

    return-object p0
.end method

.method private static I(Lcom/google/crypto/tink/shaded/protobuf/z;Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/q;)Lcom/google/crypto/tink/shaded/protobuf/z;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/crypto/tink/shaded/protobuf/z<",
            "TT;*>;>(TT;",
            "Lcom/google/crypto/tink/shaded/protobuf/i;",
            "Lcom/google/crypto/tink/shaded/protobuf/q;",
            ")TT;"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/i;->w()Lcom/google/crypto/tink/shaded/protobuf/j;

    move-result-object p1

    invoke-static {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/z;->J(Lcom/google/crypto/tink/shaded/protobuf/z;Lcom/google/crypto/tink/shaded/protobuf/j;Lcom/google/crypto/tink/shaded/protobuf/q;)Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object p0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/c0; {:try_start_0 .. :try_end_0} :catch_1

    const/4 p2, 0x0

    :try_start_1
    invoke-virtual {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/j;->a(I)V
    :try_end_1
    .catch Lcom/google/crypto/tink/shaded/protobuf/c0; {:try_start_1 .. :try_end_1} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    :try_start_2
    invoke-virtual {p1, p0}, Lcom/google/crypto/tink/shaded/protobuf/c0;->j(Lcom/google/crypto/tink/shaded/protobuf/s0;)Lcom/google/crypto/tink/shaded/protobuf/c0;

    move-result-object p0

    throw p0
    :try_end_2
    .catch Lcom/google/crypto/tink/shaded/protobuf/c0; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    move-exception p0

    throw p0
.end method

.method static J(Lcom/google/crypto/tink/shaded/protobuf/z;Lcom/google/crypto/tink/shaded/protobuf/j;Lcom/google/crypto/tink/shaded/protobuf/q;)Lcom/google/crypto/tink/shaded/protobuf/z;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/crypto/tink/shaded/protobuf/z<",
            "TT;*>;>(TT;",
            "Lcom/google/crypto/tink/shaded/protobuf/j;",
            "Lcom/google/crypto/tink/shaded/protobuf/q;",
            ")TT;"
        }
    .end annotation

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/z$f;->m:Lcom/google/crypto/tink/shaded/protobuf/z$f;

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->u(Lcom/google/crypto/tink/shaded/protobuf/z$f;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/z;

    :try_start_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/d1;->a()Lcom/google/crypto/tink/shaded/protobuf/d1;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/d1;->e(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/h1;

    move-result-object v0

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/k;->Q(Lcom/google/crypto/tink/shaded/protobuf/j;)Lcom/google/crypto/tink/shaded/protobuf/k;

    move-result-object p1

    invoke-interface {v0, p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/h1;->j(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/g1;Lcom/google/crypto/tink/shaded/protobuf/q;)V

    invoke-interface {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/h1;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/c0; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    instance-of p1, p1, Lcom/google/crypto/tink/shaded/protobuf/c0;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/c0;

    throw p0

    :cond_0
    throw p0

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    instance-of p2, p2, Lcom/google/crypto/tink/shaded/protobuf/c0;

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/c0;

    throw p0

    :cond_1
    new-instance p2, Lcom/google/crypto/tink/shaded/protobuf/c0;

    invoke-direct {p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/c0;-><init>(Ljava/io/IOException;)V

    invoke-virtual {p2, p0}, Lcom/google/crypto/tink/shaded/protobuf/c0;->j(Lcom/google/crypto/tink/shaded/protobuf/s0;)Lcom/google/crypto/tink/shaded/protobuf/c0;

    move-result-object p0

    throw p0

    :catch_2
    move-exception p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/c0;->a()Z

    move-result p2

    if-eqz p2, :cond_2

    new-instance p2, Lcom/google/crypto/tink/shaded/protobuf/c0;

    invoke-direct {p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/c0;-><init>(Ljava/io/IOException;)V

    move-object p1, p2

    :cond_2
    invoke-virtual {p1, p0}, Lcom/google/crypto/tink/shaded/protobuf/c0;->j(Lcom/google/crypto/tink/shaded/protobuf/s0;)Lcom/google/crypto/tink/shaded/protobuf/c0;

    move-result-object p0

    throw p0
.end method

.method static K(Lcom/google/crypto/tink/shaded/protobuf/z;[BIILcom/google/crypto/tink/shaded/protobuf/q;)Lcom/google/crypto/tink/shaded/protobuf/z;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/crypto/tink/shaded/protobuf/z<",
            "TT;*>;>(TT;[BII",
            "Lcom/google/crypto/tink/shaded/protobuf/q;",
            ")TT;"
        }
    .end annotation

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/z$f;->m:Lcom/google/crypto/tink/shaded/protobuf/z$f;

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->u(Lcom/google/crypto/tink/shaded/protobuf/z$f;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/z;

    :try_start_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/d1;->a()Lcom/google/crypto/tink/shaded/protobuf/d1;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/d1;->e(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/h1;

    move-result-object v6

    add-int v4, p2, p3

    new-instance v5, Lcom/google/crypto/tink/shaded/protobuf/e$b;

    invoke-direct {v5, p4}, Lcom/google/crypto/tink/shaded/protobuf/e$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/q;)V

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    invoke-interface/range {v0 .. v5}, Lcom/google/crypto/tink/shaded/protobuf/h1;->h(Ljava/lang/Object;[BIILcom/google/crypto/tink/shaded/protobuf/e$b;)V

    invoke-interface {v6, p0}, Lcom/google/crypto/tink/shaded/protobuf/h1;->b(Ljava/lang/Object;)V

    iget p1, p0, Lcom/google/crypto/tink/shaded/protobuf/a;->memoizedHashCode:I

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/c0; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/c0;->k()Lcom/google/crypto/tink/shaded/protobuf/c0;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/crypto/tink/shaded/protobuf/c0;->j(Lcom/google/crypto/tink/shaded/protobuf/s0;)Lcom/google/crypto/tink/shaded/protobuf/c0;

    move-result-object p0

    throw p0

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    instance-of p2, p2, Lcom/google/crypto/tink/shaded/protobuf/c0;

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/c0;

    throw p0

    :cond_1
    new-instance p2, Lcom/google/crypto/tink/shaded/protobuf/c0;

    invoke-direct {p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/c0;-><init>(Ljava/io/IOException;)V

    invoke-virtual {p2, p0}, Lcom/google/crypto/tink/shaded/protobuf/c0;->j(Lcom/google/crypto/tink/shaded/protobuf/s0;)Lcom/google/crypto/tink/shaded/protobuf/c0;

    move-result-object p0

    throw p0

    :catch_2
    move-exception p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/c0;->a()Z

    move-result p2

    if-eqz p2, :cond_2

    new-instance p2, Lcom/google/crypto/tink/shaded/protobuf/c0;

    invoke-direct {p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/c0;-><init>(Ljava/io/IOException;)V

    move-object p1, p2

    :cond_2
    invoke-virtual {p1, p0}, Lcom/google/crypto/tink/shaded/protobuf/c0;->j(Lcom/google/crypto/tink/shaded/protobuf/s0;)Lcom/google/crypto/tink/shaded/protobuf/c0;

    move-result-object p0

    throw p0
.end method

.method protected static L(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/z;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/crypto/tink/shaded/protobuf/z<",
            "**>;>(",
            "Ljava/lang/Class<",
            "TT;>;TT;)V"
        }
    .end annotation

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/z;->defaultInstanceMap:Ljava/util/Map;

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static s(Lcom/google/crypto/tink/shaded/protobuf/z;)Lcom/google/crypto/tink/shaded/protobuf/z;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/crypto/tink/shaded/protobuf/z<",
            "TT;*>;>(TT;)TT;"
        }
    .end annotation

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/a;->p()Lcom/google/crypto/tink/shaded/protobuf/n1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/n1;->a()Lcom/google/crypto/tink/shaded/protobuf/c0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/c0;->j(Lcom/google/crypto/tink/shaded/protobuf/s0;)Lcom/google/crypto/tink/shaded/protobuf/c0;

    move-result-object p0

    throw p0

    :cond_1
    :goto_0
    return-object p0
.end method

.method protected static x()Lcom/google/crypto/tink/shaded/protobuf/b0$i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/crypto/tink/shaded/protobuf/b0$i<",
            "TE;>;"
        }
    .end annotation

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/e1;->k()Lcom/google/crypto/tink/shaded/protobuf/e1;

    move-result-object v0

    return-object v0
.end method

.method static y(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/z;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/crypto/tink/shaded/protobuf/z<",
            "**>;>(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/z;->defaultInstanceMap:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/z;

    if-nez v0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-static {v0, v1, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/z;->defaultInstanceMap:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/z;

    goto :goto_0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Class initialization cannot fail."

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    :goto_0
    if-nez v0, :cond_2

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/s1;->k(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/z;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->z()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/z;->defaultInstanceMap:Ljava/util/Map;

    invoke-interface {v1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0

    :cond_2
    :goto_1
    return-object v0
.end method


# virtual methods
.method protected C()V
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/d1;->a()Lcom/google/crypto/tink/shaded/protobuf/d1;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/d1;->e(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/h1;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/h1;->b(Ljava/lang/Object;)V

    return-void
.end method

.method public final E()Lcom/google/crypto/tink/shaded/protobuf/z$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TBuilderType;"
        }
    .end annotation

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/z$f;->n:Lcom/google/crypto/tink/shaded/protobuf/z$f;

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->u(Lcom/google/crypto/tink/shaded/protobuf/z$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/z$a;

    return-object v0
.end method

.method public final M()Lcom/google/crypto/tink/shaded/protobuf/z$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TBuilderType;"
        }
    .end annotation

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/z$f;->n:Lcom/google/crypto/tink/shaded/protobuf/z$f;

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->u(Lcom/google/crypto/tink/shaded/protobuf/z$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/z$a;

    invoke-virtual {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->z(Lcom/google/crypto/tink/shaded/protobuf/z;)Lcom/google/crypto/tink/shaded/protobuf/z$a;

    return-object v0
.end method

.method public a()I
    .locals 2

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/z;->memoizedSerializedSize:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/d1;->a()Lcom/google/crypto/tink/shaded/protobuf/d1;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/d1;->e(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/h1;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/h1;->e(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/z;->memoizedSerializedSize:I

    :cond_0
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/z;->memoizedSerializedSize:I

    return v0
.end method

.method public bridge synthetic c()Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z;->z()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d()Lcom/google/crypto/tink/shaded/protobuf/s0$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z;->M()Lcom/google/crypto/tink/shaded/protobuf/z$a;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
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
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/d1;->a()Lcom/google/crypto/tink/shaded/protobuf/d1;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/d1;->e(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/h1;

    move-result-object v0

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/z;

    invoke-interface {v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/h1;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic g()Lcom/google/crypto/tink/shaded/protobuf/s0$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z;->E()Lcom/google/crypto/tink/shaded/protobuf/z$a;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a;->memoizedHashCode:I

    if-eqz v0, :cond_0

    return v0

    :cond_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/d1;->a()Lcom/google/crypto/tink/shaded/protobuf/d1;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/d1;->e(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/h1;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/h1;->g(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a;->memoizedHashCode:I

    return v0
.end method

.method public final i()Lcom/google/crypto/tink/shaded/protobuf/a1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/crypto/tink/shaded/protobuf/a1<",
            "TMessageType;>;"
        }
    .end annotation

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/z$f;->p:Lcom/google/crypto/tink/shaded/protobuf/z$f;

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->u(Lcom/google/crypto/tink/shaded/protobuf/z$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/a1;

    return-object v0
.end method

.method public final j()Z
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->B(Lcom/google/crypto/tink/shaded/protobuf/z;Z)Z

    move-result v0

    return v0
.end method

.method l()I
    .locals 1

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/z;->memoizedSerializedSize:I

    return v0
.end method

.method public n(Lcom/google/crypto/tink/shaded/protobuf/l;)V
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/d1;->a()Lcom/google/crypto/tink/shaded/protobuf/d1;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/d1;->e(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/h1;

    move-result-object v0

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/m;->P(Lcom/google/crypto/tink/shaded/protobuf/l;)Lcom/google/crypto/tink/shaded/protobuf/m;

    move-result-object p1

    invoke-interface {v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/h1;->i(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/v1;)V

    return-void
.end method

.method q(I)V
    .locals 0

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/z;->memoizedSerializedSize:I

    return-void
.end method

.method r()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/z$f;->l:Lcom/google/crypto/tink/shaded/protobuf/z$f;

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->u(Lcom/google/crypto/tink/shaded/protobuf/z$f;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method protected final t()Lcom/google/crypto/tink/shaded/protobuf/z$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<MessageType:",
            "Lcom/google/crypto/tink/shaded/protobuf/z<",
            "TMessageType;TBuilderType;>;BuilderType:",
            "Lcom/google/crypto/tink/shaded/protobuf/z$a<",
            "TMessageType;TBuilderType;>;>()TBuilderType;"
        }
    .end annotation

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/z$f;->n:Lcom/google/crypto/tink/shaded/protobuf/z$f;

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->u(Lcom/google/crypto/tink/shaded/protobuf/z$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/z$a;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/u0;->e(Lcom/google/crypto/tink/shaded/protobuf/s0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected u(Lcom/google/crypto/tink/shaded/protobuf/z$f;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->w(Lcom/google/crypto/tink/shaded/protobuf/z$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected v(Lcom/google/crypto/tink/shaded/protobuf/z$f;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->w(Lcom/google/crypto/tink/shaded/protobuf/z$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected abstract w(Lcom/google/crypto/tink/shaded/protobuf/z$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public final z()Lcom/google/crypto/tink/shaded/protobuf/z;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/z$f;->o:Lcom/google/crypto/tink/shaded/protobuf/z$f;

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->u(Lcom/google/crypto/tink/shaded/protobuf/z$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/z;

    return-object v0
.end method
