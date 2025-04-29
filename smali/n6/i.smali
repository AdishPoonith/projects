.class public final Ln6/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lm6/w;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ld7/b0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lm6/w;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm6/w;",
            "Ljava/util/List<",
            "Ld7/b0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lq6/x;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm6/w;

    iput-object p1, p0, Ln6/i;->a:Lm6/w;

    iput-object p2, p0, Ln6/i;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ld7/b0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ln6/i;->b:Ljava/util/List;

    return-object v0
.end method

.method public b()Lm6/w;
    .locals 1

    iget-object v0, p0, Ln6/i;->a:Lm6/w;

    return-object v0
.end method
