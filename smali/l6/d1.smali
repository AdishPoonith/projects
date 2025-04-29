.class public Ll6/d1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lm6/i;

.field private b:Ln6/d;


# direct methods
.method constructor <init>(Lm6/i;Ln6/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/d1;->a:Lm6/i;

    iput-object p2, p0, Ll6/d1;->b:Ln6/d;

    return-void
.end method


# virtual methods
.method public a()Lm6/i;
    .locals 1

    iget-object v0, p0, Ll6/d1;->a:Lm6/i;

    return-object v0
.end method

.method public b()Ln6/d;
    .locals 1

    iget-object v0, p0, Ll6/d1;->b:Ln6/d;

    return-object v0
.end method
