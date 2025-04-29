.class Lj6/f1$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj6/f1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final a:Lm6/l;

.field private b:Z


# direct methods
.method constructor <init>(Lm6/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj6/f1$b;->a:Lm6/l;

    return-void
.end method

.method static synthetic a(Lj6/f1$b;)Z
    .locals 0

    iget-boolean p0, p0, Lj6/f1$b;->b:Z

    return p0
.end method

.method static synthetic b(Lj6/f1$b;Z)Z
    .locals 0

    iput-boolean p1, p0, Lj6/f1$b;->b:Z

    return p1
.end method

.method static synthetic c(Lj6/f1$b;)Lm6/l;
    .locals 0

    iget-object p0, p0, Lj6/f1$b;->a:Lm6/l;

    return-object p0
.end method
