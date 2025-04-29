.class public abstract Lm6/q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm6/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lm6/q$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final j:Lm6/q$a;

.field public static final k:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lm6/s;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Lm6/w;->k:Lm6/w;

    invoke-static {}, Lm6/l;->h()Lm6/l;

    move-result-object v1

    const/4 v2, -0x1

    invoke-static {v0, v1, v2}, Lm6/q$a;->h(Lm6/w;Lm6/l;I)Lm6/q$a;

    move-result-object v0

    sput-object v0, Lm6/q$a;->j:Lm6/q$a;

    sget-object v0, Lm6/p;->j:Lm6/p;

    sput-object v0, Lm6/q$a;->k:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Lm6/s;Lm6/s;)I
    .locals 0

    invoke-static {p0, p1}, Lm6/q$a;->p(Lm6/s;Lm6/s;)I

    move-result p0

    return p0
.end method

.method public static h(Lm6/w;Lm6/l;I)Lm6/q$a;
    .locals 1

    new-instance v0, Lm6/b;

    invoke-direct {v0, p0, p1, p2}, Lm6/b;-><init>(Lm6/w;Lm6/l;I)V

    return-object v0
.end method

.method public static i(Lm6/w;I)Lm6/q$a;
    .locals 8

    invoke-virtual {p0}, Lm6/w;->g()Lw5/q;

    move-result-object v0

    invoke-virtual {v0}, Lw5/q;->l()J

    move-result-wide v0

    invoke-virtual {p0}, Lm6/w;->g()Lw5/q;

    move-result-object p0

    invoke-virtual {p0}, Lw5/q;->k()I

    move-result p0

    add-int/lit8 p0, p0, 0x1

    new-instance v2, Lm6/w;

    int-to-double v3, p0

    const-wide v5, 0x41cdcd6500000000L    # 1.0E9

    cmpl-double v7, v3, v5

    if-nez v7, :cond_0

    new-instance p0, Lw5/q;

    const-wide/16 v3, 0x1

    add-long/2addr v0, v3

    const/4 v3, 0x0

    invoke-direct {p0, v0, v1, v3}, Lw5/q;-><init>(JI)V

    goto :goto_0

    :cond_0
    new-instance v3, Lw5/q;

    invoke-direct {v3, v0, v1, p0}, Lw5/q;-><init>(JI)V

    move-object p0, v3

    :goto_0
    invoke-direct {v2, p0}, Lm6/w;-><init>(Lw5/q;)V

    invoke-static {}, Lm6/l;->h()Lm6/l;

    move-result-object p0

    invoke-static {v2, p0, p1}, Lm6/q$a;->h(Lm6/w;Lm6/l;I)Lm6/q$a;

    move-result-object p0

    return-object p0
.end method

.method public static k(Lm6/i;)Lm6/q$a;
    .locals 2

    invoke-interface {p0}, Lm6/i;->g()Lm6/w;

    move-result-object v0

    invoke-interface {p0}, Lm6/i;->getKey()Lm6/l;

    move-result-object p0

    const/4 v1, -0x1

    invoke-static {v0, p0, v1}, Lm6/q$a;->h(Lm6/w;Lm6/l;I)Lm6/q$a;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic p(Lm6/s;Lm6/s;)I
    .locals 0

    invoke-static {p0}, Lm6/q$a;->k(Lm6/i;)Lm6/q$a;

    move-result-object p0

    invoke-static {p1}, Lm6/q$a;->k(Lm6/i;)Lm6/q$a;

    move-result-object p1

    invoke-virtual {p0, p1}, Lm6/q$a;->g(Lm6/q$a;)I

    move-result p0

    return p0
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lm6/q$a;

    invoke-virtual {p0, p1}, Lm6/q$a;->g(Lm6/q$a;)I

    move-result p1

    return p1
.end method

.method public g(Lm6/q$a;)I
    .locals 2

    invoke-virtual {p0}, Lm6/q$a;->o()Lm6/w;

    move-result-object v0

    invoke-virtual {p1}, Lm6/q$a;->o()Lm6/w;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm6/w;->b(Lm6/w;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Lm6/q$a;->l()Lm6/l;

    move-result-object v0

    invoke-virtual {p1}, Lm6/q$a;->l()Lm6/l;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm6/l;->g(Lm6/l;)I

    move-result v0

    if-eqz v0, :cond_1

    return v0

    :cond_1
    invoke-virtual {p0}, Lm6/q$a;->n()I

    move-result v0

    invoke-virtual {p1}, Lm6/q$a;->n()I

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method

.method public abstract l()Lm6/l;
.end method

.method public abstract n()I
.end method

.method public abstract o()Lm6/w;
.end method
