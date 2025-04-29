.class public Lj6/w1$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj6/w1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field final a:Lm6/n;

.field final b:Lj6/o;

.field private final c:Z

.field final d:Ld6/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld6/e<",
            "Lm6/l;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lm6/n;Lj6/o;Ld6/e;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm6/n;",
            "Lj6/o;",
            "Ld6/e<",
            "Lm6/l;",
            ">;Z)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj6/w1$b;->a:Lm6/n;

    iput-object p2, p0, Lj6/w1$b;->b:Lj6/o;

    iput-object p3, p0, Lj6/w1$b;->d:Ld6/e;

    iput-boolean p4, p0, Lj6/w1$b;->c:Z

    return-void
.end method

.method synthetic constructor <init>(Lm6/n;Lj6/o;Ld6/e;ZLj6/w1$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lj6/w1$b;-><init>(Lm6/n;Lj6/o;Ld6/e;Z)V

    return-void
.end method

.method static synthetic a(Lj6/w1$b;)Z
    .locals 0

    iget-boolean p0, p0, Lj6/w1$b;->c:Z

    return p0
.end method


# virtual methods
.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lj6/w1$b;->c:Z

    return v0
.end method
