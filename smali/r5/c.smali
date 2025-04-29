.class public final Lr5/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr5/c$b;,
        Lr5/c$c;
    }
.end annotation


# instance fields
.field private final a:Lr5/a;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lr5/c$c;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/lang/Integer;


# direct methods
.method private constructor <init>(Lr5/a;Ljava/util/List;Ljava/lang/Integer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr5/a;",
            "Ljava/util/List<",
            "Lr5/c$c;",
            ">;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr5/c;->a:Lr5/a;

    iput-object p2, p0, Lr5/c;->b:Ljava/util/List;

    iput-object p3, p0, Lr5/c;->c:Ljava/lang/Integer;

    return-void
.end method

.method synthetic constructor <init>(Lr5/a;Ljava/util/List;Ljava/lang/Integer;Lr5/c$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lr5/c;-><init>(Lr5/a;Ljava/util/List;Ljava/lang/Integer;)V

    return-void
.end method

.method public static a()Lr5/c$b;
    .locals 1

    new-instance v0, Lr5/c$b;

    invoke-direct {v0}, Lr5/c$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lr5/c;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lr5/c;

    iget-object v0, p0, Lr5/c;->a:Lr5/a;

    iget-object v2, p1, Lr5/c;->a:Lr5/a;

    invoke-virtual {v0, v2}, Lr5/a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lr5/c;->b:Ljava/util/List;

    iget-object v2, p1, Lr5/c;->b:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lr5/c;->c:Ljava/lang/Integer;

    iget-object p1, p1, Lr5/c;->c:Ljava/lang/Integer;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lr5/c;->a:Lr5/a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lr5/c;->b:Ljava/util/List;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lr5/c;->a:Lr5/a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lr5/c;->b:Ljava/util/List;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lr5/c;->c:Ljava/lang/Integer;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "(annotations=%s, entries=%s, primaryKeyId=%s)"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
