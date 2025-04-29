.class public final synthetic Lf1/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp0/j0$b;


# instance fields
.field public final synthetic a:Lf1/l0$a;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lf1/l0$a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/k0;->a:Lf1/l0$a;

    iput-object p2, p0, Lf1/k0;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final b(Lp0/o0;)V
    .locals 2

    iget-object v0, p0, Lf1/k0;->a:Lf1/l0$a;

    iget-object v1, p0, Lf1/k0;->b:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lf1/l0;->a(Lf1/l0$a;Ljava/lang/String;Lp0/o0;)V

    return-void
.end method
