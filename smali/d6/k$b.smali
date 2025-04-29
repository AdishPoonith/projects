.class Ld6/k$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld6/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld6/k$b$a;,
        Ld6/k$b$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A:",
        "Ljava/lang/Object;",
        "B:",
        "Ljava/lang/Object;",
        "C:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TA;>;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "TB;TC;>;"
        }
    .end annotation
.end field

.field private final c:Ld6/c$a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld6/c$a$a<",
            "TA;TB;>;"
        }
    .end annotation
.end field

.field private d:Ld6/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld6/j<",
            "TA;TC;>;"
        }
    .end annotation
.end field

.field private e:Ld6/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld6/j<",
            "TA;TC;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/util/List;Ljava/util/Map;Ld6/c$a$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TA;>;",
            "Ljava/util/Map<",
            "TB;TC;>;",
            "Ld6/c$a$a<",
            "TA;TB;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld6/k$b;->a:Ljava/util/List;

    iput-object p2, p0, Ld6/k$b;->b:Ljava/util/Map;

    iput-object p3, p0, Ld6/k$b;->c:Ld6/c$a$a;

    return-void
.end method

.method private a(II)Ld6/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ld6/h<",
            "TA;TC;>;"
        }
    .end annotation

    if-nez p2, :cond_0

    invoke-static {}, Ld6/g;->i()Ld6/g;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    iget-object p2, p0, Ld6/k$b;->a:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    new-instance p2, Ld6/f;

    invoke-direct {p0, p1}, Ld6/k$b;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p2, p1, v0, v1, v1}, Ld6/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ld6/h;Ld6/h;)V

    return-object p2

    :cond_1
    div-int/lit8 p2, p2, 0x2

    add-int v0, p1, p2

    invoke-direct {p0, p1, p2}, Ld6/k$b;->a(II)Ld6/h;

    move-result-object p1

    add-int/lit8 v1, v0, 0x1

    invoke-direct {p0, v1, p2}, Ld6/k$b;->a(II)Ld6/h;

    move-result-object p2

    iget-object v1, p0, Ld6/k$b;->a:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Ld6/f;

    invoke-direct {p0, v0}, Ld6/k$b;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v1, v0, v2, p1, p2}, Ld6/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ld6/h;Ld6/h;)V

    return-object v1
.end method

.method public static b(Ljava/util/List;Ljava/util/Map;Ld6/c$a$a;Ljava/util/Comparator;)Ld6/k;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Object;",
            "B:",
            "Ljava/lang/Object;",
            "C:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TA;>;",
            "Ljava/util/Map<",
            "TB;TC;>;",
            "Ld6/c$a$a<",
            "TA;TB;>;",
            "Ljava/util/Comparator<",
            "TA;>;)",
            "Ld6/k<",
            "TA;TC;>;"
        }
    .end annotation

    new-instance v0, Ld6/k$b;

    invoke-direct {v0, p0, p1, p2}, Ld6/k$b;-><init>(Ljava/util/List;Ljava/util/Map;Ld6/c$a$a;)V

    invoke-static {p0, p3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    new-instance p1, Ld6/k$b$a;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p2

    invoke-direct {p1, p2}, Ld6/k$b$a;-><init>(I)V

    invoke-virtual {p1}, Ld6/k$b$a;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ld6/k$b$b;

    iget v1, p2, Ld6/k$b$b;->b:I

    sub-int/2addr p0, v1

    iget-boolean v2, p2, Ld6/k$b$b;->a:Z

    if-eqz v2, :cond_0

    sget-object p2, Ld6/h$a;->k:Ld6/h$a;

    invoke-direct {v0, p2, v1, p0}, Ld6/k$b;->c(Ld6/h$a;II)V

    goto :goto_0

    :cond_0
    sget-object v2, Ld6/h$a;->k:Ld6/h$a;

    invoke-direct {v0, v2, v1, p0}, Ld6/k$b;->c(Ld6/h$a;II)V

    iget p2, p2, Ld6/k$b$b;->b:I

    sub-int/2addr p0, p2

    sget-object v1, Ld6/h$a;->j:Ld6/h$a;

    invoke-direct {v0, v1, p2, p0}, Ld6/k$b;->c(Ld6/h$a;II)V

    goto :goto_0

    :cond_1
    new-instance p0, Ld6/k;

    iget-object p1, v0, Ld6/k$b;->d:Ld6/j;

    if-nez p1, :cond_2

    invoke-static {}, Ld6/g;->i()Ld6/g;

    move-result-object p1

    :cond_2
    const/4 p2, 0x0

    invoke-direct {p0, p1, p3, p2}, Ld6/k;-><init>(Ld6/h;Ljava/util/Comparator;Ld6/k$a;)V

    return-object p0
.end method

.method private c(Ld6/h$a;II)V
    .locals 2

    add-int/lit8 v0, p3, 0x1

    add-int/lit8 p2, p2, -0x1

    invoke-direct {p0, v0, p2}, Ld6/k$b;->a(II)Ld6/h;

    move-result-object p2

    iget-object v0, p0, Ld6/k$b;->a:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    sget-object v0, Ld6/h$a;->j:Ld6/h$a;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    new-instance p1, Ld6/i;

    invoke-direct {p0, p3}, Ld6/k$b;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p1, p3, v0, v1, p2}, Ld6/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ld6/h;Ld6/h;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ld6/f;

    invoke-direct {p0, p3}, Ld6/k$b;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p1, p3, v0, v1, p2}, Ld6/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ld6/h;Ld6/h;)V

    :goto_0
    iget-object p2, p0, Ld6/k$b;->d:Ld6/j;

    if-nez p2, :cond_1

    iput-object p1, p0, Ld6/k$b;->d:Ld6/j;

    goto :goto_1

    :cond_1
    iget-object p2, p0, Ld6/k$b;->e:Ld6/j;

    invoke-virtual {p2, p1}, Ld6/j;->t(Ld6/h;)V

    :goto_1
    iput-object p1, p0, Ld6/k$b;->e:Ld6/j;

    return-void
.end method

.method private d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;)TC;"
        }
    .end annotation

    iget-object v0, p0, Ld6/k$b;->b:Ljava/util/Map;

    iget-object v1, p0, Ld6/k$b;->c:Ld6/c$a$a;

    invoke-interface {v1, p1}, Ld6/c$a$a;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
