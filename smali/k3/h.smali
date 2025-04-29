.class final Lk3/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld3/h;


# instance fields
.field private final j:Lk3/d;

.field private final k:[J

.field private final l:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lk3/g;",
            ">;"
        }
    .end annotation
.end field

.field private final m:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lk3/e;",
            ">;"
        }
    .end annotation
.end field

.field private final n:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lk3/d;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk3/d;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lk3/g;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lk3/e;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk3/h;->j:Lk3/d;

    iput-object p3, p0, Lk3/h;->m:Ljava/util/Map;

    iput-object p4, p0, Lk3/h;->n:Ljava/util/Map;

    if-eqz p2, :cond_0

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p2

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p2

    :goto_0
    iput-object p2, p0, Lk3/h;->l:Ljava/util/Map;

    invoke-virtual {p1}, Lk3/d;->j()[J

    move-result-object p1

    iput-object p1, p0, Lk3/h;->k:[J

    return-void
.end method


# virtual methods
.method public b(J)I
    .locals 2

    iget-object v0, p0, Lk3/h;->k:[J

    const/4 v1, 0x0

    invoke-static {v0, p1, p2, v1, v1}, Lp3/n0;->e([JJZZ)I

    move-result p1

    iget-object p2, p0, Lk3/h;->k:[J

    array-length p2, p2

    if-ge p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public g(I)J
    .locals 3

    iget-object v0, p0, Lk3/h;->k:[J

    aget-wide v1, v0, p1

    return-wide v1
.end method

.method public h(J)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Ld3/b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lk3/h;->j:Lk3/d;

    iget-object v3, p0, Lk3/h;->l:Ljava/util/Map;

    iget-object v4, p0, Lk3/h;->m:Ljava/util/Map;

    iget-object v5, p0, Lk3/h;->n:Ljava/util/Map;

    move-wide v1, p1

    invoke-virtual/range {v0 .. v5}, Lk3/d;->h(JLjava/util/Map;Ljava/util/Map;Ljava/util/Map;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public i()I
    .locals 1

    iget-object v0, p0, Lk3/h;->k:[J

    array-length v0, v0

    return v0
.end method
