.class public final Lb5/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb5/q$b;,
        Lb5/q$c;
    }
.end annotation


# instance fields
.field private final a:Lb5/c;

.field private final b:Z

.field private final c:Lb5/q$c;

.field private final d:I


# direct methods
.method private constructor <init>(Lb5/q$c;)V
    .locals 3

    invoke-static {}, Lb5/c;->f()Lb5/c;

    move-result-object v0

    const/4 v1, 0x0

    const v2, 0x7fffffff

    invoke-direct {p0, p1, v1, v0, v2}, Lb5/q;-><init>(Lb5/q$c;ZLb5/c;I)V

    return-void
.end method

.method private constructor <init>(Lb5/q$c;ZLb5/c;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/q;->c:Lb5/q$c;

    iput-boolean p2, p0, Lb5/q;->b:Z

    iput-object p3, p0, Lb5/q;->a:Lb5/c;

    iput p4, p0, Lb5/q;->d:I

    return-void
.end method

.method static synthetic a(Lb5/q;)Lb5/c;
    .locals 0

    iget-object p0, p0, Lb5/q;->a:Lb5/c;

    return-object p0
.end method

.method static synthetic b(Lb5/q;)Z
    .locals 0

    iget-boolean p0, p0, Lb5/q;->b:Z

    return p0
.end method

.method static synthetic c(Lb5/q;)I
    .locals 0

    iget p0, p0, Lb5/q;->d:I

    return p0
.end method

.method public static d(C)Lb5/q;
    .locals 0

    invoke-static {p0}, Lb5/c;->d(C)Lb5/c;

    move-result-object p0

    invoke-static {p0}, Lb5/q;->e(Lb5/c;)Lb5/q;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lb5/c;)Lb5/q;
    .locals 2

    invoke-static {p0}, Lb5/n;->n(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lb5/q;

    new-instance v1, Lb5/q$a;

    invoke-direct {v1, p0}, Lb5/q$a;-><init>(Lb5/c;)V

    invoke-direct {v0, v1}, Lb5/q;-><init>(Lb5/q$c;)V

    return-object v0
.end method

.method private g(Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            ")",
            "Ljava/util/Iterator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lb5/q;->c:Lb5/q$c;

    invoke-interface {v0, p0, p1}, Lb5/q$c;->a(Lb5/q;Ljava/lang/CharSequence;)Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public f(Ljava/lang/CharSequence;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lb5/n;->n(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0, p1}, Lb5/q;->g(Ljava/lang/CharSequence;)Ljava/util/Iterator;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public h()Lb5/q;
    .locals 1

    invoke-static {}, Lb5/c;->h()Lb5/c;

    move-result-object v0

    invoke-virtual {p0, v0}, Lb5/q;->i(Lb5/c;)Lb5/q;

    move-result-object v0

    return-object v0
.end method

.method public i(Lb5/c;)Lb5/q;
    .locals 4

    invoke-static {p1}, Lb5/n;->n(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lb5/q;

    iget-object v1, p0, Lb5/q;->c:Lb5/q$c;

    iget-boolean v2, p0, Lb5/q;->b:Z

    iget v3, p0, Lb5/q;->d:I

    invoke-direct {v0, v1, v2, p1, v3}, Lb5/q;-><init>(Lb5/q$c;ZLb5/c;I)V

    return-object v0
.end method
