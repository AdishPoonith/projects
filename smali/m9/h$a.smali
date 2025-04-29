.class final Lm9/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm9/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:[Lm9/h$a;

.field private final b:I

.field private final c:I


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x100

    new-array v0, v0, [Lm9/h$a;

    iput-object v0, p0, Lm9/h$a;->a:[Lm9/h$a;

    const/4 v0, 0x0

    iput v0, p0, Lm9/h$a;->b:I

    iput v0, p0, Lm9/h$a;->c:I

    return-void
.end method

.method constructor <init>(II)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lm9/h$a;->a:[Lm9/h$a;

    iput p1, p0, Lm9/h$a;->b:I

    and-int/lit8 p1, p2, 0x7

    if-nez p1, :cond_0

    const/16 p1, 0x8

    :cond_0
    iput p1, p0, Lm9/h$a;->c:I

    return-void
.end method

.method static synthetic a(Lm9/h$a;)[Lm9/h$a;
    .locals 0

    iget-object p0, p0, Lm9/h$a;->a:[Lm9/h$a;

    return-object p0
.end method

.method static synthetic b(Lm9/h$a;)I
    .locals 0

    iget p0, p0, Lm9/h$a;->b:I

    return p0
.end method

.method static synthetic c(Lm9/h$a;)I
    .locals 0

    iget p0, p0, Lm9/h$a;->c:I

    return p0
.end method
