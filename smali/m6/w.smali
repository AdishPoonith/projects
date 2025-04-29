.class public final Lm6/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lm6/w;",
        ">;"
    }
.end annotation


# static fields
.field public static final k:Lm6/w;


# instance fields
.field private final j:Lw5/q;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lm6/w;

    new-instance v1, Lw5/q;

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Lw5/q;-><init>(JI)V

    invoke-direct {v0, v1}, Lm6/w;-><init>(Lw5/q;)V

    sput-object v0, Lm6/w;->k:Lm6/w;

    return-void
.end method

.method public constructor <init>(Lw5/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm6/w;->j:Lw5/q;

    return-void
.end method


# virtual methods
.method public b(Lm6/w;)I
    .locals 1

    iget-object v0, p0, Lm6/w;->j:Lw5/q;

    iget-object p1, p1, Lm6/w;->j:Lw5/q;

    invoke-virtual {v0, p1}, Lw5/q;->b(Lw5/q;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lm6/w;

    invoke-virtual {p0, p1}, Lm6/w;->b(Lm6/w;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lm6/w;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lm6/w;

    invoke-virtual {p0, p1}, Lm6/w;->b(Lm6/w;)I

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public g()Lw5/q;
    .locals 1

    iget-object v0, p0, Lm6/w;->j:Lw5/q;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, Lm6/w;->g()Lw5/q;

    move-result-object v0

    invoke-virtual {v0}, Lw5/q;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SnapshotVersion(seconds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm6/w;->j:Lw5/q;

    invoke-virtual {v1}, Lw5/q;->l()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", nanos="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm6/w;->j:Lw5/q;

    invoke-virtual {v1}, Lw5/q;->k()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
