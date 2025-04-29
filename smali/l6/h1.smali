.class public Ll6/h1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ld6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld6/c<",
            "Lm6/l;",
            "Lm6/i;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ld6/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld6/e<",
            "Lm6/l;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ld6/c;Ld6/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld6/c<",
            "Lm6/l;",
            "Lm6/i;",
            ">;",
            "Ld6/e<",
            "Lm6/l;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/h1;->a:Ld6/c;

    iput-object p2, p0, Ll6/h1;->b:Ld6/e;

    return-void
.end method


# virtual methods
.method public a()Ld6/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld6/c<",
            "Lm6/l;",
            "Lm6/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ll6/h1;->a:Ld6/c;

    return-object v0
.end method

.method public b()Ld6/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld6/e<",
            "Lm6/l;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ll6/h1;->b:Ld6/e;

    return-object v0
.end method
