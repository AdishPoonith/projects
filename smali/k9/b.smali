.class final Lk9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm9/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk9/b$a;
    }
.end annotation


# static fields
.field private static final m:Ljava/util/logging/Logger;


# instance fields
.field private final j:Lk9/b$a;

.field private final k:Lm9/c;

.field private final l:Lk9/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lk9/i;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lk9/b;->m:Ljava/util/logging/Logger;

    return-void
.end method

.method constructor <init>(Lk9/b$a;Lm9/c;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lk9/j;

    sget-object v1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    const-class v2, Lk9/i;

    invoke-direct {v0, v1, v2}, Lk9/j;-><init>(Ljava/util/logging/Level;Ljava/lang/Class;)V

    iput-object v0, p0, Lk9/b;->l:Lk9/j;

    const-string v0, "transportExceptionHandler"

    invoke-static {p1, v0}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lk9/b$a;

    iput-object p1, p0, Lk9/b;->j:Lk9/b$a;

    const-string p1, "frameWriter"

    invoke-static {p2, p1}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm9/c;

    iput-object p1, p0, Lk9/b;->k:Lm9/c;

    return-void
.end method

.method static a(Ljava/lang/Throwable;)Ljava/util/logging/Level;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    const-class v0, Ljava/io/IOException;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    return-object p0

    :cond_0
    sget-object p0, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    return-object p0
.end method


# virtual methods
.method public E()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lk9/b;->k:Lm9/c;

    invoke-interface {v0}, Lm9/c;->E()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lk9/b;->j:Lk9/b$a;

    invoke-interface {v1, v0}, Lk9/b$a;->e(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public F(Lm9/i;)V
    .locals 2

    iget-object v0, p0, Lk9/b;->l:Lk9/j;

    sget-object v1, Lk9/j$a;->k:Lk9/j$a;

    invoke-virtual {v0, v1}, Lk9/j;->j(Lk9/j$a;)V

    :try_start_0
    iget-object v0, p0, Lk9/b;->k:Lm9/c;

    invoke-interface {v0, p1}, Lm9/c;->F(Lm9/i;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object v0, p0, Lk9/b;->j:Lk9/b$a;

    invoke-interface {v0, p1}, Lk9/b$a;->e(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public I(Lm9/i;)V
    .locals 2

    iget-object v0, p0, Lk9/b;->l:Lk9/j;

    sget-object v1, Lk9/j$a;->k:Lk9/j$a;

    invoke-virtual {v0, v1, p1}, Lk9/j;->i(Lk9/j$a;Lm9/i;)V

    :try_start_0
    iget-object v0, p0, Lk9/b;->k:Lm9/c;

    invoke-interface {v0, p1}, Lm9/c;->I(Lm9/i;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object v0, p0, Lk9/b;->j:Lk9/b$a;

    invoke-interface {v0, p1}, Lk9/b$a;->e(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public K(ZILokio/c;I)V
    .locals 6

    iget-object v0, p0, Lk9/b;->l:Lk9/j;

    sget-object v1, Lk9/j$a;->k:Lk9/j$a;

    invoke-virtual {p3}, Lokio/c;->a()Lokio/c;

    move-result-object v3

    move v2, p2

    move v4, p4

    move v5, p1

    invoke-virtual/range {v0 .. v5}, Lk9/j;->b(Lk9/j$a;ILokio/c;IZ)V

    :try_start_0
    iget-object v0, p0, Lk9/b;->k:Lm9/c;

    invoke-interface {v0, p1, p2, p3, p4}, Lm9/c;->K(ZILokio/c;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Lk9/b;->j:Lk9/b$a;

    invoke-interface {p2, p1}, Lk9/b$a;->e(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public R(ILm9/a;[B)V
    .locals 3

    iget-object v0, p0, Lk9/b;->l:Lk9/j;

    sget-object v1, Lk9/j$a;->k:Lk9/j$a;

    invoke-static {p3}, Lokio/f;->n([B)Lokio/f;

    move-result-object v2

    invoke-virtual {v0, v1, p1, p2, v2}, Lk9/j;->c(Lk9/j$a;ILm9/a;Lokio/f;)V

    :try_start_0
    iget-object v0, p0, Lk9/b;->k:Lm9/c;

    invoke-interface {v0, p1, p2, p3}, Lm9/c;->R(ILm9/a;[B)V

    iget-object p1, p0, Lk9/b;->k:Lm9/c;

    invoke-interface {p1}, Lm9/c;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Lk9/b;->j:Lk9/b$a;

    invoke-interface {p2, p1}, Lk9/b$a;->e(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public V()I
    .locals 1

    iget-object v0, p0, Lk9/b;->k:Lm9/c;

    invoke-interface {v0}, Lm9/c;->V()I

    move-result v0

    return v0
.end method

.method public X(ZZIILjava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZII",
            "Ljava/util/List<",
            "Lm9/d;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lk9/b;->k:Lm9/c;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lm9/c;->X(ZZIILjava/util/List;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Lk9/b;->j:Lk9/b$a;

    invoke-interface {p2, p1}, Lk9/b$a;->e(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public close()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lk9/b;->k:Lm9/c;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lk9/b;->m:Ljava/util/logging/Logger;

    invoke-static {v0}, Lk9/b;->a(Ljava/lang/Throwable;)Ljava/util/logging/Level;

    move-result-object v2

    const-string v3, "Failed closing connection"

    invoke-virtual {v1, v2, v3, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public d(ILm9/a;)V
    .locals 2

    iget-object v0, p0, Lk9/b;->l:Lk9/j;

    sget-object v1, Lk9/j$a;->k:Lk9/j$a;

    invoke-virtual {v0, v1, p1, p2}, Lk9/j;->h(Lk9/j$a;ILm9/a;)V

    :try_start_0
    iget-object v0, p0, Lk9/b;->k:Lm9/c;

    invoke-interface {v0, p1, p2}, Lm9/c;->d(ILm9/a;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Lk9/b;->j:Lk9/b$a;

    invoke-interface {p2, p1}, Lk9/b$a;->e(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public f(ZII)V
    .locals 9

    const-wide v0, 0xffffffffL

    const/16 v2, 0x20

    iget-object v3, p0, Lk9/b;->l:Lk9/j;

    sget-object v4, Lk9/j$a;->k:Lk9/j$a;

    int-to-long v5, p2

    shl-long/2addr v5, v2

    int-to-long v7, p3

    and-long/2addr v0, v7

    or-long/2addr v0, v5

    if-eqz p1, :cond_0

    invoke-virtual {v3, v4, v0, v1}, Lk9/j;->f(Lk9/j$a;J)V

    goto :goto_0

    :cond_0
    invoke-virtual {v3, v4, v0, v1}, Lk9/j;->e(Lk9/j$a;J)V

    :goto_0
    :try_start_0
    iget-object v0, p0, Lk9/b;->k:Lm9/c;

    invoke-interface {v0, p1, p2, p3}, Lm9/c;->f(ZII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    iget-object p2, p0, Lk9/b;->j:Lk9/b$a;

    invoke-interface {p2, p1}, Lk9/b$a;->e(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method

.method public flush()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lk9/b;->k:Lm9/c;

    invoke-interface {v0}, Lm9/c;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lk9/b;->j:Lk9/b$a;

    invoke-interface {v1, v0}, Lk9/b$a;->e(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public g(IJ)V
    .locals 2

    iget-object v0, p0, Lk9/b;->l:Lk9/j;

    sget-object v1, Lk9/j$a;->k:Lk9/j$a;

    invoke-virtual {v0, v1, p1, p2, p3}, Lk9/j;->k(Lk9/j$a;IJ)V

    :try_start_0
    iget-object v0, p0, Lk9/b;->k:Lm9/c;

    invoke-interface {v0, p1, p2, p3}, Lm9/c;->g(IJ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Lk9/b;->j:Lk9/b$a;

    invoke-interface {p2, p1}, Lk9/b$a;->e(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
