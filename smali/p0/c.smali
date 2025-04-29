.class public final synthetic Lp0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lp0/g;

.field public final synthetic k:Lp0/a$a;


# direct methods
.method public synthetic constructor <init>(Lp0/g;Lp0/a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp0/c;->j:Lp0/g;

    iput-object p2, p0, Lp0/c;->k:Lp0/a$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lp0/c;->j:Lp0/g;

    iget-object v1, p0, Lp0/c;->k:Lp0/a$a;

    invoke-static {v0, v1}, Lp0/g;->a(Lp0/g;Lp0/a$a;)V

    return-void
.end method
