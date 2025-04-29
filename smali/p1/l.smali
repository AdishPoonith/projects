.class public final synthetic Lp1/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp0/j0$b;


# instance fields
.field public final synthetic a:Lp1/m;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/util/Date;

.field public final synthetic d:Ljava/util/Date;


# direct methods
.method public synthetic constructor <init>(Lp1/m;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/l;->a:Lp1/m;

    iput-object p2, p0, Lp1/l;->b:Ljava/lang/String;

    iput-object p3, p0, Lp1/l;->c:Ljava/util/Date;

    iput-object p4, p0, Lp1/l;->d:Ljava/util/Date;

    return-void
.end method


# virtual methods
.method public final b(Lp0/o0;)V
    .locals 4

    iget-object v0, p0, Lp1/l;->a:Lp1/m;

    iget-object v1, p0, Lp1/l;->b:Ljava/lang/String;

    iget-object v2, p0, Lp1/l;->c:Ljava/util/Date;

    iget-object v3, p0, Lp1/l;->d:Ljava/util/Date;

    invoke-static {v0, v1, v2, v3, p1}, Lp1/m;->V1(Lp1/m;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lp0/o0;)V

    return-void
.end method
