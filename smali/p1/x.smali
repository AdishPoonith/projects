.class public final synthetic Lp1/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/u$d;


# instance fields
.field public final synthetic a:Lp1/y;


# direct methods
.method public synthetic constructor <init>(Lp1/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/x;->a:Lp1/y;

    return-void
.end method


# virtual methods
.method public final a(Lp1/u$f;)V
    .locals 1

    iget-object v0, p0, Lp1/x;->a:Lp1/y;

    invoke-static {v0, p1}, Lp1/y;->I1(Lp1/y;Lp1/u$f;)V

    return-void
.end method
