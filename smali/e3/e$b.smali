.class final Le3/e$b;
.super Ld3/l;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le3/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ld3/l;",
        "Ljava/lang/Comparable<",
        "Le3/e$b;",
        ">;"
    }
.end annotation


# instance fields
.field private s:J


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ld3/l;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Le3/e$a;)V
    .locals 0

    invoke-direct {p0}, Le3/e$b;-><init>()V

    return-void
.end method

.method static synthetic C(Le3/e$b;J)J
    .locals 0

    iput-wide p1, p0, Le3/e$b;->s:J

    return-wide p1
.end method


# virtual methods
.method public D(Le3/e$b;)I
    .locals 8

    invoke-virtual {p0}, Lv1/a;->r()Z

    move-result v0

    invoke-virtual {p1}, Lv1/a;->r()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, -0x1

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Lv1/a;->r()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, -0x1

    :goto_0
    return v2

    :cond_1
    iget-wide v0, p0, Lv1/g;->n:J

    iget-wide v4, p1, Lv1/g;->n:J

    sub-long/2addr v0, v4

    const-wide/16 v4, 0x0

    cmp-long v6, v0, v4

    if-nez v6, :cond_2

    iget-wide v0, p0, Le3/e$b;->s:J

    iget-wide v6, p1, Le3/e$b;->s:J

    sub-long/2addr v0, v6

    cmp-long p1, v0, v4

    if-nez p1, :cond_2

    const/4 p1, 0x0

    return p1

    :cond_2
    cmp-long p1, v0, v4

    if-lez p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v2, -0x1

    :goto_1
    return v2
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Le3/e$b;

    invoke-virtual {p0, p1}, Le3/e$b;->D(Le3/e$b;)I

    move-result p1

    return p1
.end method
