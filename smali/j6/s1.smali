.class public Lj6/s1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lm6/t;

.field private final b:Ln6/d;

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ln6/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lm6/t;Ln6/d;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm6/t;",
            "Ln6/d;",
            "Ljava/util/List<",
            "Ln6/e;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj6/s1;->a:Lm6/t;

    iput-object p2, p0, Lj6/s1;->b:Ln6/d;

    iput-object p3, p0, Lj6/s1;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(Lm6/l;Ln6/m;)Ln6/f;
    .locals 7

    iget-object v3, p0, Lj6/s1;->b:Ln6/d;

    if-eqz v3, :cond_0

    new-instance v6, Ln6/l;

    iget-object v2, p0, Lj6/s1;->a:Lm6/t;

    iget-object v5, p0, Lj6/s1;->c:Ljava/util/List;

    move-object v0, v6

    move-object v1, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Ln6/l;-><init>(Lm6/l;Lm6/t;Ln6/d;Ln6/m;Ljava/util/List;)V

    return-object v6

    :cond_0
    new-instance v0, Ln6/o;

    iget-object v1, p0, Lj6/s1;->a:Lm6/t;

    iget-object v2, p0, Lj6/s1;->c:Ljava/util/List;

    invoke-direct {v0, p1, v1, p2, v2}, Ln6/o;-><init>(Lm6/l;Lm6/t;Ln6/m;Ljava/util/List;)V

    return-object v0
.end method
