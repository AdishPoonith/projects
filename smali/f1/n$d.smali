.class public final Lf1/n$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf1/q$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf1/n;->a(Lf1/n$b;Lf1/n$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lf1/n$a;

.field final synthetic b:Lf1/n$b;


# direct methods
.method constructor <init>(Lf1/n$a;Lf1/n$b;)V
    .locals 0

    iput-object p1, p0, Lf1/n$d;->a:Lf1/n$a;

    iput-object p2, p0, Lf1/n$d;->b:Lf1/n$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lf1/n$d;->a:Lf1/n$a;

    sget-object v1, Lf1/n;->a:Lf1/n;

    iget-object v1, p0, Lf1/n$d;->b:Lf1/n$b;

    invoke-static {v1}, Lf1/n;->g(Lf1/n$b;)Z

    move-result v1

    invoke-interface {v0, v1}, Lf1/n$a;->a(Z)V

    return-void
.end method
