.class public La3/g$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La3/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# instance fields
.field public final j:Ljava/lang/String;

.field public final k:La3/g$d;

.field public final l:J

.field public final m:I

.field public final n:J

.field public final o:Lw1/m;

.field public final p:Ljava/lang/String;

.field public final q:Ljava/lang/String;

.field public final r:J

.field public final s:J

.field public final t:Z


# direct methods
.method private constructor <init>(Ljava/lang/String;La3/g$d;JIJLw1/m;Ljava/lang/String;Ljava/lang/String;JJZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La3/g$e;->j:Ljava/lang/String;

    iput-object p2, p0, La3/g$e;->k:La3/g$d;

    iput-wide p3, p0, La3/g$e;->l:J

    iput p5, p0, La3/g$e;->m:I

    iput-wide p6, p0, La3/g$e;->n:J

    iput-object p8, p0, La3/g$e;->o:Lw1/m;

    iput-object p9, p0, La3/g$e;->p:Ljava/lang/String;

    iput-object p10, p0, La3/g$e;->q:Ljava/lang/String;

    iput-wide p11, p0, La3/g$e;->r:J

    iput-wide p13, p0, La3/g$e;->s:J

    iput-boolean p15, p0, La3/g$e;->t:Z

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;La3/g$d;JIJLw1/m;Ljava/lang/String;Ljava/lang/String;JJZLa3/g$a;)V
    .locals 0

    invoke-direct/range {p0 .. p15}, La3/g$e;-><init>(Ljava/lang/String;La3/g$d;JIJLw1/m;Ljava/lang/String;Ljava/lang/String;JJZ)V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Long;)I
    .locals 5

    iget-wide v0, p0, La3/g$e;->n:J

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    iget-wide v0, p0, La3/g$e;->n:J

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-gez p1, :cond_1

    const/4 p1, -0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, La3/g$e;->b(Ljava/lang/Long;)I

    move-result p1

    return p1
.end method
